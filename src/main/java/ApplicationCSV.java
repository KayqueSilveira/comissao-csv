import Domain.request.CsvFileRequest;
import Domain.response.CsvFileResponse;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ApplicationCSV {

  public static void main(String args[]) throws IOException {

    Scanner path = new Scanner(System.in);
    System.out.println("Digite o diretorio do arquivo: ");
    String pathFile = path.nextLine();

    Scanner filtro = new Scanner(System.in);
    System.out.println("Digite o nome do filter{storeId} do arquivo: ");
    String filter = filtro.nextLine();

    Reader reader = Files.newBufferedReader(Paths.get(pathFile));
    CsvToBean<CsvFileRequest> csvToBean = new CsvToBeanBuilder(reader)
        .withType(CsvFileRequest.class)
        .build();

    List<CsvFileRequest> csvFileRequests;
    List<Double> objeto = new ArrayList<>();
    CsvFileResponse csvFileResponse = new CsvFileResponse();
    csvFileResponse.setStoreId(filter);

    csvFileRequests = csvToBean.parse();


    for (CsvFileRequest csv : csvFileRequests) {
      if (csv.getStoreId().equals(filter)) {
        objeto.add(csv.getPrice());
      }
    }
    var resultado=0;

    for(int i =0; i<=objeto.size(); i++){
      if(i == objeto.size()){
        break;
      }
      resultado += objeto.get(i);

    }

    csvFileResponse.setPrice(resultado);
    csvFileResponse.setComissao(resultado);

    System.out.println(csvFileResponse.toString());

  }
}
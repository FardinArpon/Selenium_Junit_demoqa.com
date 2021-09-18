import org.junit.Test;

import java.io.IOException;

public class readData_Excel_File {
    @Test
    public void readExcelFile() throws IOException {
        String filePath = ".\\src\\test\\resources";
        Utils.readFromExcel(filePath,"Symlefile.xls","Sheet1");
    }

}

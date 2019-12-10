package com;


import com.sun.org.apache.xerces.internal.xs.datatypes.ObjectList;
import com.univocity.parsers.csv.CsvFormat;
import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;
import com.univocity.parsers.csv.CsvWriter;
import com.univocity.parsers.csv.CsvWriterSettings;
import org.apache.log4j.Logger;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CsvUtils {
    private static Logger logger=Logger.getLogger(CsvUtils.class);


    /**
     *   创建csv文件：
     * @param heads
     * @param rows
     * @param outPutPath
     * @param filename
     */
    public static void createCsvFile(String[] heads, List<Object[]> rows, String outPutPath, String filename)
    {

        // CsvWriter (and all other file writers) work with an instance of
        // java.io.Writer
        File csvFile = new File(outPutPath + filename + ".csv");
        File parent = csvFile.getParentFile();
        if (parent != null && !parent.exists()) {
            parent.mkdirs();
        }
        try {
            csvFile.createNewFile();
            Writer fileWriter = new FileWriter(csvFile);

            // By default, only values that contain a field separator are enclosed within quotes.
            // If quotes are part of the value, they are escaped automatically as well. Empty rows are discarded automatically.
            // Set the field delimiter to ';', the default value is ','
            CsvWriterSettings settings = new CsvWriterSettings();
            CsvFormat format = settings.getFormat();
            format.setDelimiter(';');

            CsvWriter writer = new CsvWriter(fileWriter, settings);

            // Write the record headers of this file
            writer.writeHeaders(heads);

            // Write contents and close the given output Writer instance.
            writer.writeRowsAndClose(rows);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e);
        }
    }


    /**
     * 读取csv文件。。
     * @param filePath
     * @return
     * @throws IOException
     */
    public static List<String[]> readCsv(String filePath) throws IOException {
//        List<Object> eslImports = new ArrayList<Object>();
        File file = new File(filePath);
        InputStream in = new FileInputStream(file);
        InputStreamReader reader = new InputStreamReader(in, "UTF-8");

        CsvParserSettings settings = new CsvParserSettings();
        settings.getFormat().setLineSeparator("\n");

        CsvParser parser = new CsvParser(settings);
        //读取数据到列表
        List<String[]> allRows = parser.parseAll(reader);
        //处理读取到的数据

        return  allRows;

    }
}

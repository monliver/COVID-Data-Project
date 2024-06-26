//version 1.3

package datamanagement;

import util.CovidData;
import org.json.simple.parser.ParseException;

import java.util.List;
import java.io.IOException;

public interface CovidDataReader {
    public List<CovidData> read() throws IOException, ParseException, java.text.ParseException;
}


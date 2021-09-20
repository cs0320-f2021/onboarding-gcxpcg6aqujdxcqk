package edu.brown.cs.student.main;

import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.assertEquals;

public class CSVReaderTest {

  @Test(expected = FileNotFoundException.class)
  public void testFileNotFoundException() throws FileNotFoundException {
    CSVReader reader = new CSVReader();
    reader.readFile(null);
  }

  @Test
  public void testReadFile() throws FileNotFoundException {
    CSVReader reader = new CSVReader();
    reader.readFile("data/stars/ten-star.csv");
    assertEquals("Read 10 stars from data/stars/ten-star.csv", );
  }

}

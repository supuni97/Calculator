package com.kelaniya.uni.v5.repository;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class FileNumberRepository implements com.kelaniya.uni.v5.repository.NumberRepository {

    public Double[] getNumbers() throws NumberRepositoryException {

        List<String> numbersStrs = null;
        try {

                 numbersStrs=Files.readAllLines(
                         Paths.get("User/desktop//Calculator/numbers.txt")
                 );
        } catch (IOException e) {
            throw new NumberRepositoryException(e,"Couldn't read the text file");
        }

        double number1 = Double.parseDouble(numbersStrs.get(0));
        double number2 = Double.parseDouble(numbersStrs.get(1));

        return new Double[]{number1, number2};
    }
}

package model.readere;

import model.clase.Aplicant;
import model.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader extends AplicantReader{
    @Override
    public List<Aplicant> readAplicanti(String file) throws FileNotFoundException {
        Scanner input = new Scanner(new File(file));
        input.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<>();

        while (input.hasNext()) {
            Student student = new Student();
            super.citireAplicant(input,student);

            int an_studii = input.nextInt();
            student.setAn_studii(an_studii);
            String facultate = (input.next()).toString();
            student.setFacultate(facultate);

            studenti.add(student);
        }
        input.close();
        return studenti;
    }
}

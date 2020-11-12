/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labonen;

import java.util.Scanner;

/**
 *
 * @author vitya
 */
public final class Student extends Man {

    private Number gradebook;

 

    public Student() {
    }

    public Student(Text lastName, Text firstName, Text middleName) {
        super(lastName, firstName, middleName);
    }

    public Student(Text lastName, Text firstName, Text middleName, Number gradebook, Date birthday) {
        super(lastName, firstName, middleName, birthday, null);
        this.gradebook = gradebook;

    }

    @Override
    public Number setDocument() {
        System.out.println("Student:setDocument()");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(gradebook);
        return gradebook;
    }
}

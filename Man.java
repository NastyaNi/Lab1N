/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labonen;

import static java.lang.String.valueOf;
import java.util.Scanner;
import labonen.Number;

/**
 *
 * @author vitya
 */
public class Man {

    private Text lastName;
    private Text firstName;
    private Text middleName;
    private Date birthday;
    private Number passport;

    protected Man() {
    }

    protected Man(Text lastName, Text firstName, Text middleName) {
        this(lastName, firstName, middleName, null, null);

    }

    protected Man(Text lastName, Text firstName, Text middleName, Date birthday, Number passport) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthday = birthday;
        this.passport = passport;

    }

    public Number setDocument() {

        System.out.println("Man:setDocument()");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(passport);
        return passport;
    }

    public final Date setDate() {
        System.out.println("Man:setDate:");
         Scanner scanner = new Scanner(System.in);
        String y = scanner.nextLine();
        System.out.println(birthday);
        return birthday;
    }

    public Text getLastName() {
        return lastName;
    }

    public Text getFirstName() {
        return firstName;
    }

    public Text getMiddleName() {
        return middleName;
    }

    public Date getBirthday() {
        return birthday;
    }

    // public Number getPassport() {
    //return passport;
    // }
    public void setLastName(Text lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(Text firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(Text middleName) {
        this.middleName = middleName;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    // public void setPassport(Number passport) {
    //  this.passport = passport;
    // }//

   
}

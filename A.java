/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labonen;

import java.util.Scanner;
import labonen.Number;
/**
 *
 * @author vitya
 */
public class A {

    private A a1;
    private A a2;

    public A() {
        System.out.println("A:A ()");
    }

    public A(A a1) {
        this.a1 = a1;
        System.out.println("A:A (A)");
    }

    protected A(A a1, A a2) {
        this(a1);
        this.a2 = a2;
        System.out.println("A:A (A,A)");
    }

   public A getA1() {
       return a1;
   }

    public A getA2() {
        return a2;
   }

    public void setA1(A a1) {
        this.a1 = a1;
    }

    public void setA2(A a2) {
        this.a2 = a2;
    }
    public void a() {
    }

    protected void a(A a1) {
    }

    private void a(A a1, A a2) {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Man d = new Man();
        Student n = new Student();
        new A();
        A a1 = new A(null, null);
       d.setDocument(); 
       d.setDate();
       n.setDocument();
      // d.setBirthday();
    }
}

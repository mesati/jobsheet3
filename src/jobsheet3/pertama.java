/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet3;

/**
 *
 * @author WINDOWS 10
 */
class pertama 
{
    private int a = 10;
    
    protected void terprotek ()
    {
        System.out.println("Method ini hanya untuk anakanya");
    }
    public void info ()
    {
        System.out.print("a = "+a);
        System.out.println("Dipanggil pada = " +this.getClass ().getName());
    }
}

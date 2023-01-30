package org.example.set.example3;

public class ExampleHashSet {
    public void manageHashSet3(){
        IManageHashSet iManageHashSet = new ManageHashSetImp();

        iManageHashSet.addElement("texto1");
        iManageHashSet.addElement("texto2");
        iManageHashSet.addElement("texto3");

        System.out.println(iManageHashSet.lookForElement("texto1"));
        iManageHashSet.deleteElement("texto1");
        System.out.println(iManageHashSet.lookForElement("texto1"));
    }
}

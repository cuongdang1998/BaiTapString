/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

/**
 *
 * @author quoccuong
 */
public class Employee implements Comparable<Employee>{

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the position
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(String position) {
        this.position = position;
    }
    private String id;
    private String name;
    private String position;
    public Employee() {
    }
    public Employee(String id) {
        this.id = id;
    }
    public Employee(String id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    @Override
    public String toString() {
        return this.getId()+" "+ this.getName()+" "+this.getPosition();
    }
    
    public int compareTo(Employee e) {
       return this.getName().compareTo(e.getName());
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Employee){
            Employee e= (Employee) obj;
            if(this.getId().equals(e.getId())){
                return true;
            }
        }
        return false;
    }
}

package by.it;

import java.io.Serializable;
import java.util.List;

public class Group implements Serializable {
    List<Student> group;

    public Group(){

    }

    @Override
    public String toString() {
        return "Group{" + "group=" + group + '}';
    }

    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    public void addStudent(Student student){
        this.group.add(student);
    }

}

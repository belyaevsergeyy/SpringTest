package by.itstep;

import java.io.Serializable;
import java.util.Objects;

public class HelloWorld implements Serializable {
    private String HelloMessage;

    public HelloWorld(){
        HelloMessage = "";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HelloWorld that = (HelloWorld) o;
        return Objects.equals(HelloMessage, that.HelloMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(HelloMessage);
    }

    public String getHelloMessage() {
        return HelloMessage;
    }

    public void setHelloMessage(String helloMessage) {
        HelloMessage = helloMessage;
    }

    @Override
    public String toString() {
        return "HelloWorld{" +
                "HelloMessage='" + HelloMessage + '\'' +
                '}';
    }
}

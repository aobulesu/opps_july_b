package compiletimepolymorphism;

public class printer {

    void print(){
        System.out.println("I am empty");
    }

    void print(String s){
        System.out.println("I am also empty");
    }

    //String print(String a){ // we dont consider the return type for tebmethod over loading
   //     System.out.println("I am also empty");
  //  }

}


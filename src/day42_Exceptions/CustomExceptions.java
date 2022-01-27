package day42_Exceptions;




class FadyException extends RuntimeException{

    public FadyException(){
        super("Time for short break");
    }

    public FadyException(String message){
        super(message);
    }
}

class noBreakException extends Exception{

}

public class CustomExceptions {

    public static void main(String[] args){

        //throw new FadyException();


        try {
            throw new noBreakException();
        } catch (noBreakException e) {
            e.printStackTrace();
        }

    }
}

//custom unchecked exception

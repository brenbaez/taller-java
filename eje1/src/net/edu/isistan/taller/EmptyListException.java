package net.edu.isistan.taller;


public class EmptyListException extends IllegalArgumentException {


    public EmptyListException(){

    }
        public EmptyListException(String error) {
            super(error);
        }
}

package com.company;

public class Main {

    public class fib {
        int first = 0;
        int second = 1;
        int next;

        int[] generatedNumbers ;

        public fib(int numbers) {
            // public int[] fib(int numbers){
            generatedNumbers = new int[numbers];


            for(int i = 0; i< numbers; i++){
                if (i < 2){
                    generatedNumbers[i] = i;
                }else {
                    next = first + second;
                    first = second;
                    second = next;
                    generatedNumbers[i] = next;
                }
                System.out.println(generatedNumbers[i]);
            }
        }

        public int[] getGeneratedNumbers() {
            return generatedNumbers;
        }
        public void setGeneratesNumbers(int[] generatedNumbers) {
            this.generatedNumbers = generatedNumbers;
        }
    }}

package com.test;


public class CustomKeyUtil { 

                private static String[] ss = { "AIU5", "BKL9", "CRG0", "RGH1", "VYJ8", "OAJ7", "DBN5", "ZUO4", "EKS9", "FTR5", "KOC2", "LQP5", "MVT9",

                                                                                "GSD5", "HGJ6", "QKL7", "WOP8", "NVB9", "PHK1", "XJF4", "SUS3", "TLJ0", "UVX4", "IBH9", "JRO0", "YUR9", "1RH0",

                                                                                "290U", "345H", "4FG5", "5BK8", "6LO9", "7VF4", "8JR0", "9DF8", "0FGH" };

                // only the alpha- to be used as the first character of the key. rest of the characters will be received from the ssalphanumeric.

                private static String[] stralpha = { "A", "B", "C", "D", "E", "F", "G", "H","I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

                                // 26+ 10+10 =  46 values -  added the numbers to 3 times so that we willl get equal opportunities for numbers too.

                private static String[] stralphanumeric = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "V", "W", "X", "Y", "Z"};

                // generates a key starting with alpha  ex:  A3M8QS, XJ2RS7

                public static String generateKey(){

                                int k1 = getRandomNo(26);

                                int k2 = getRandomNo(46);

                                int k3 = getRandomNo(46);

                                int k4 = getRandomNo(46);

                                int k5 = getRandomNo(46);

                                int k6 = getRandomNo(46);

                                return stralpha[k1] + stralphanumeric[k2] +  stralphanumeric[k3]+ stralphanumeric[k4]+ stralphanumeric[k5]+ stralphanumeric[k6];

                }

                public static int getRandomNo(int max){

                                //int min = 0;

                                //return (int) (Math.floor(Math.random() * (max - min + 1)) + min);

                                return (int) (Math.floor(Math.random() * (max )));

                }

                public static String generateKey(int keysize){

                                // 26 and 46 are the sizes of the two alphanumeric arrays

                                int k1 = getRandomNo(26);

                                String key = stralpha[k1];

                                for (int i=1; i<keysize; i++){

                                                key+=stralphanumeric[getRandomNo(46)];

                                }

                                return key;

                }

               

 

}

/*var KeyGenerator = {

                                getKey : function() {

 

                                                var k1 = this.getRandomNo(35);

                                                var k2 = this.getRandomNo(35);

                                                var k3 = this.getRandomNo(25);

                                                return ss[k3] + ss[k2] + new Date().getTime() + ss[k1];

                                },

                                getRandomNo : function(max) {

                                                var min = 0;

                                                return Math.floor(Math.random() * (max - min + 1)) + min;

                                }

                }; */

 


 

????   = L  java04/Bai1  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Ljava04/Bai1; 	fibonacci (I)I n I a b x sum i StackMapTable main ([Ljava/lang/String;)V	    java/lang/System   out Ljava/io/PrintStream; ! Nhap n: 
 # % $ java/io/PrintStream & ' println (Ljava/lang/String;)V ) java/util/Scanner	  + , - in Ljava/io/InputStream;
 ( /  0 (Ljava/io/InputStream;)V
 ( 2 3 4 nextInt ()I 6 java/lang/StringBuilder 8 Tong gia tri day Fibonacci: 
 5 :  '
  <  
 5 > ? @ append (I)Ljava/lang/StringBuilder;
 5 B C D toString ()Ljava/lang/String; args [Ljava/lang/String; sc Ljava/util/Scanner; F 
SourceFile 	Bai1.java !               /     *? ?    
                    	       ?     0<=>6? ?6? <=`>`6?????    
   6        	  
 	              $  -     >    0      .     ,     *    	 '             ?    ?  	       ?     =?  ? "? (Y? *? .M,? 1<???d???? ? 5Y7? 9? ;? =? A? "?    
                 #  <           = E F    %     * G H      ?   I  (    J    K
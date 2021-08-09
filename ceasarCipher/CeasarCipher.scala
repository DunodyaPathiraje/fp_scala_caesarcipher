//19001101
//Implemented Encryption and Decryption functions of Caesar cipher

import java.util.Scanner
import scala.io.StdIn.readLine

package ceasarCipher{
  object CeasarCipher {
    //Encryption function
    def encryptFunction(sh:Int, msg:String, a:String): Unit ={
      val encryptmessage = msg.map( (c: Char) => {
        val x = a.indexOf(c.toUpper);

        if (x == -1)
          c
        else
          a((x + sh) % a.size);
      });
      println(encryptmessage);
    }

    //Decryption function
    def decryptFunction(sh:Int, msg:String, a:String): Unit ={
      val decryptmessage = msg.map( (c: Char) => {
        val x = a.indexOf(c.toUpper);

        if (x == -1)
          c
        else
          a((x + sh) % a.size);
      });
      println(decryptmessage);
    }

    //main function
    def main(args: Array[String]): Unit = {

      var input = new Scanner(System.in);

      val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

      println("1. Encrypt the message");
      println("2. Decrypt the message\n ");
      print("Enter your choice : ");
      val ch = input.nextLine().toInt;

      ch match {
        case 1 =>{    //Encrypt section
          print("Enter number to shift : ");
          val shift = (input.nextLine().toInt + alphabet.size) % alphabet.size;

          print("Enter secret message to encrypt :");
          val smessage = input.nextLine();

          encryptFunction(shift, smessage, alphabet);
        }
        case 2 =>{  //Decrypt section
          print("Enter number to shift : ");
          val shift = (input.nextLine().toInt + alphabet.size) % alphabet.size;

          print("Enter secret message to decrypt :");
          val smessage = input.nextLine();

          decryptFunction(shift, smessage, alphabet);
        }
        case _ =>{
          println("Entered the wrong value as choice.");
        }
      }
    }
  }
}


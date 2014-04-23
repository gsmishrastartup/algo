package com.example.endian;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public class Test {

  public static void main(String[] args) throws Exception {
    String str = "A0000000";
    System.out.println((getUInt32(hexStringToByteArray(str))));
    //System.out.println((Long.toBinaryString(Long.MAX_VALUE)).length());
    //System.out.println(Long.MAX_VALUE);
  }
  public static long getUInt32(byte[] bytes) throws EOFException, IOException {
    //byte[] bytes = getBytes(4);
    long value = bytes[0] & 0xFF;
    value |= (bytes[1] << 8) & 0xFFFF;
    value |= (bytes[2] << 16) & 0xFFFFFF;
    value |= (bytes[3] << 24) & 0xFFFFFFFF;
    return value;
}  
  
  public static byte[] hexStringToByteArray(String s) {
    int len = s.length();
    byte[] data = new byte[len / 2];
    for (int i = 0; i < len; i += 2) {
        data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
                             + Character.digit(s.charAt(i+1), 16));
    }
    //System.out.println(bytesToHex(data));
    return data;
}
  final protected static char[] hexArray = "0123456789ABCDEF".toCharArray();
  public static String bytesToHex(byte[] bytes) {
      char[] hexChars = new char[bytes.length * 2];
      for ( int j = 0; j < bytes.length; j++ ) {
          int v = bytes[j] & 0xFF;
          hexChars[j * 2] = hexArray[v >>> 4];
          hexChars[j * 2 + 1] = hexArray[v & 0x0F];
          //System.out.println(hexChars);
      }
      return new String(hexChars);
  }
  public static byte[] decompress(byte[] data) throws IOException, DataFormatException {  
    Inflater inflater = new Inflater();   
    inflater.setInput(data);  
    
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);  
    byte[] buffer = new byte[1024];  
    while (!inflater.finished()) {  
     int count = inflater.inflate(buffer);  
     outputStream.write(buffer, 0, count);  
    }  
    outputStream.close();  
    byte[] output = outputStream.toByteArray();  
    
    inflater.end();
    
    return output;  
   }  
}

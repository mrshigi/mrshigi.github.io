package lab05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class ManyLoops extends TestCase {
  
  /**
   * A test method.
   * (Replace "X" with a name describing the test.  You may write as
   * many "testSomething" methods in this class as you wish, and each
   * one will be called when running JUnit over this class.)
   */
  public void testDIYDivide() {
    for(int i = 0;i<100;++i){
      int a = (int)(Math.random()*1000);
      int b = (int)(Math.random()*100)+1;
      int ans = ManyLoops.DIYDivide(a,b);
      int gt = a/b;
      if(ans!=gt) 
        fail("\nfor DIYDivide():\nfor a="+ a+" and b="+b+"\n"+" your code returned "+ ans +"\n"
             +   "should have returned " + gt);
    }
  }

  public int  greatestLTOERecursive(int n){
   if(n<2) return 1;
   else return 2*greatestLTOERecursive(n/2);
  }
  public void testGreatestPowerOf2LTOE(){
    String powersOf2 = "";
    for(int i=0;i<12;++i){
      if(powersOf2.length()>0) powersOf2+=",";
      powersOf2+=(int)Math.pow(2,i);
    }
    for(int i = 0;i<100;++i){
     int num = (int)(Math.random()*1000)+2;
     int ansRec = greatestLTOERecursive(num);
     int ansIter = ManyLoops.greatestPowerOf2LTOE(num);
     if(ansRec!=ansIter){
      fail("\nfor ManyLoops.greatestPowerOf2LTOE(num)\n"
             +"input n = "+num+"\n"
             +"expected: " + ansRec +"\n"
             +"received: " + ansIter +" (<- your answer)\n"
               +"(the first 12 powers of 2 are "+powersOf2+" )");
     }
    }
  }

  public void testSmallestPowerOf2GTOE(){
    String powersOf2 = "";
    for(int i=0;i<12;++i){
      if(powersOf2.length()>0) powersOf2+=",";
      powersOf2+=(int)Math.pow(2,i);
    }
    for(int i = 0;i<100;++i){
     int num = (int)(Math.random()*1000)+2;
     int nshift = num;
     int p=0;
     while(num>>p > 0){
      ++p; 
     }
     int ansShift = (int)(Math.pow(2,p));
     
     if (ansShift == 2*num) {
       ansShift/=2;
     }
     int ansIter = ManyLoops.smallestPowerOf2GTOE(num);
     if(ansShift!=ansIter){
      fail("\nfor ManyLoops.smallestPowerOf2GTOE(num)\n"
             +"input n = "+num+"\n"
             +"expected: " + ansShift +"\n"
             +"received: " + ansIter +" (<- your answer)\n"
               +"(the first 12 powers of 2 are "+powersOf2+" )");
     }
    }
  }
  
  public String nRecursive(int n){
    if(n==0) return "";
    else{
     return nRecursive(n-1)+(char)('a'+n-1); 
    }
  }
  
  public void testFirstNAlphabet(){
    for(int i=0;i<100;++i){
     int n = (int)(Math.random()*27);
     String ansRec = nRecursive(n);
     String ansIterative = ManyLoops.firstNAlphabet(n);
     if(!ansRec.equals(ansIterative)){
      fail("\nfor firstNAlphabet():\nyour code returned:\n"
           +ansIterative+", when it should have returned...\n"
           +ansRec+"\n( n was = " + n+ ")");
     }
    }
  }
  
  public char randomChar0z(){
   return (char)( Math.random()*((int)'z'-(int)'0')+(int)'0' ); 
  }
  public String randomString(int len){
    String s = "";
    for(int i =0;i<len;i++){
     char c = randomChar0z();
     s+=c;   
    }
    return s;
  }
  public void testDIYindexOf(){
    for(int i = 0;i<100;++i){
     String s = randomString(30);
     char random = randomChar0z();
     int ansLibrary = s.indexOf(random);
     int ansIter = ManyLoops.DIYindexOf(s,random);
     if(ansLibrary!=ansIter){
      fail("\nfor testDIYindexOf() searching\n"
             +"String: "+s
             +"\nfor: "+random
             +"\n  expected: "+ansLibrary
             +"\n  received: "+ansIter+"(<-- yours)\n"
             );
     }
    }
  }
}

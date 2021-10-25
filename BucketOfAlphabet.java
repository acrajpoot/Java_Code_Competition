/*Problem Statement:
John is a 5-year-old kid who is eager to learn English words. Recently he has learnt all the alphabetsand now he wants to learn English words.
Anne, John's mother has a bucket of alphabetsand shedecided to teach herchild English wordsusing a new method. Anne’s plan is to use the bucket of 
alphabetsto make him learn English words, shewill tell the word to John and hehas to pick the alphabets from the bucket to make that word.
Now you are going to help John find out if he can form the given word with the bucket of alphabets that Anne has given to John.Your program should 
print "YES" if John can form the given word with the given bucket of alphabets and "NO" if John cannot form the given word with the given bucket of alphabets.
  Note: 
All alphabets and words are in upper case.
Alphabets in the bucket can be duplicates.If a word has duplicate letters, for example "PARROT". Then the bucket of alphabets should have 2 'R' 
to decide this word to be "YES" in the output.
Alphabets are taken out of the bucket as the words are formed. 
(Alphabets used in the 1stword are taken out of the bucket after it is formed. Next word is formed based on the only remaining alphabets in the bucket and so on.)


Input:
Line 1 -English alphabets in bucket with comma separated
Line 2 -No of words(n) that Anne going to give to Johnnext n lines -words that Anne gave to John
Output:
n lines of "YES" or "NO"


Example 1:
Input:H, F, B, A, C, L, K, G, V, C, B, I, U, K, F
1
BLACKBUCK
Output:YES
Explanation:The bucket of alphabets has all the letters in the given word "BLACKBUCK" so the output is "YES"*/



import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.next();
		String[] res = str.split("[,]", 0);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
		    int count=0;
		    String st=sc.next();
		    String[] st_arr=new String[st.length()];
		    for(int j=0;j<st.length();j++){
		        st_arr[j]=String.valueOf(st.charAt(j));
		    }
		    
		    
		  for(int k=0;k<st_arr.length;k++){
		      for(int l=0;l<res.length;l++){
		          if((st_arr[k]).equals(res[l])){
		              count=count+1;
		              for (int m = l; m < res.length - 1; m++) {
		                  res[m] = res[m + 1];
		                  }
		              break;
		          }
		      }
		  }
		  if(count==st_arr.length){
		      System.out.println("yes");
		  }
		  else{
		      System.out.println("No");
		  }
		}
	}
}

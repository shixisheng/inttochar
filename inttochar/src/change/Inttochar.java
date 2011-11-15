package change;

public class Inttochar {
   int inntt;
  char[] change(int inntt ){
	  int a=inntt;
	  int[] s=new int[100];
	  int i=0,j=0,u=0,k=0,h=0,g=0;
	  int b,c=0;
	  char[] p=new char[100];
	  char[] q=new char[25];int[] d=new int[100];
	  while(a!=0)
	  {
		  b=a%16;
		  a=a/16;
		  s[i++]=b;
	  }
	  h=--i;
	  for(j=i;j>=0;j--)
	  {
		  switch(s[j]){
		  case 0:
			  p[j]='0';break;
		  case 1:
			  p[j]='1';break;
		  case 2:
			  p[j]='2';break;
		  case 3:
			  p[j]='3';break;
		  case 4:
			  p[j]='4';break;
		  case 5:
			  p[j]='5';break;
		  case 6:
			  p[j]='6';break;
		  case 7:
			  p[j]='7';break;
		  case 8:
			  p[j]='8';break;
		  case 9:
			  p[j]='9';break;
		  case 10:
			  p[j]='A';break;
		  case 11:
			  p[j]='B';break;
		  case 12:
			  p[j]='C';break;
		  case 13:
			  p[j]='D';break;
		  case 14:
			  p[j]='E';break;
		  case 15:
			  p[j]='F';	break;	  
		  };
	  }
	return p; 
  } 
  public static void main(String[] args){	  
	  char[] p=new char[25];
	  Inttochar A=new Inttochar();
	  p=A.change(600);
	  for(int i=p.length-1;i>=0;i--)
	  {System.out.print(p[i]);}
}
  }

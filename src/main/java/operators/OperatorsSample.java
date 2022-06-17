package operators;

/**
 * arithematic,relational,logical,increment and decremnt ,shift operators
 * @author sp22082
 *
 */

public class OperatorsSample {

	public static void main(String[] args) {

        //  -- ARITHEMATIC OPERATORS--
		System.out.println("---------------------------");
int a=10,b=5;
System.out.println("addition :"+(a+b));
System.out.println("subtraction :"+(a-b));
System.out.println("multiplication :"+(a*b));
System.out.println("division :"+(a/b));
System.out.println("remainder :"+(a%b));


        //  --RELATIONAL OPERATORS
System.out.println("---------------------------");

int c=10,d=3;
if(c>d) { System.out.println("c is greater than d");}
else if(c<d) { System.out.println("c is less than d");}
else if(c<=d) { System.out.println("c is less than and equal to d");}
else if(c>=d) { System.out.println("c is greater than and equal to d");}
else if(c!=d) {System.out.println("c is not equal to d");}
else  { System.out.println("c is equal to d");}


        //  --LOGICAL OPERATORS--
System.out.println("---------------------------");

boolean i=true,j=false;
if(i&&j) {System.out.println("AND operator");}
else if(i||j) {System.out.println("OR operator");}
else if(!i) {System.out.println("NOT operator");}
else  {System.out.println("XOR operator");}


        //  --POST AND PRE INCREMENT OPERATOR--

System.out.println("---------------------------");
int p=4,q,r;
q=++p;                                  //first value is incremented then it is assigned to another variable
System.out.println("PRE INCREMENT:"+q);
System.out.println("p value after pre increment:"+p);
r=q++;                                  //first value is assigned then it is incremented.
System.out.println("POST INCREMENT:"+r);
System.out.println("q value after post increment:"+q);


        //  --PRE AND POST DECREMENT OPERATOR--
System.out.println("---------------------------");

int g=5,h,f;
h=--g;                             //first value is decremented then it is assigned to another variable
System.out.println("PRE DECREMENT:"+h);
System.out.println("g value after pre decrement:"+g);
f=h--;                             //first value is assigned then it is decremented.
System.out.println("POST DECREMENT:"+f);
System.out.println("h value after post decrement:"+h);


        //  --SHIFT OPERATORS--

    //  --SIGNED AND UNSIGNED RIGHT SHIFT OPERATOR--
System.out.println("---------------------------");

int usr=10;
System.out.println("UNSIGNED RIGHT SHIFT:"+(10>>>2));    //it will perform right shift operation 2 times irrespective of the MSB bit.
int x = -10,y = 0;
y = x >> 2;
System.out.println("SIGNED RIGHT SHIFT:"+y);         //if the MSB bit is '1' then 2's complement is performed on value.


   //  -- LEFT SHIFT OPERATOR--
System.out.println("---------------------------");

int left=10;
System.out.println("UNSIGNED LEFT SHIFT:"+(10<<2));   //here both unsigned and signed are same as shifting is happening to left side(MSB bit is not considered).






	}

}

package aulas;
 {

    public static void main(String args[]){

        int i=1;

        int v=2;

        int z=7;

        boolean t=true;

        if(i>=1 || (v<=2 && (z==7 || t==false))){

            System.out.println("Primeiro if");

        }

        if(i!=1 || (v<2 && (z==7 && t==true))){

            System.out.println("Segundo if");

        }       

        if(i>1 || (v<=2 && (z==7 && 1!=1))){

            System.out.println("Terceiro if");

        }       

    }

}
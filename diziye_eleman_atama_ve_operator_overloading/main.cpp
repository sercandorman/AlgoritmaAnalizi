#include <cstdlib>
#include <iostream>

using namespace std;



class myClass
{
      public:
             int dizi[100];
             int sonraki;
             myClass::myClass()
             {
                 sonraki=0;
             }
      myClass myClass::operator=(myClass array){
         
         if(sonraki== array.sonraki){
                      for(int i=0;i<=sonraki;i++){
                      dizi[i]=array.dizi[i];        //Karma��kl��� O(n) dir. For d�ng�s�nden dolay�
                      }
         }      
         else{
              cout<<"hata";
              }           
       }
      void ekle(int a)
             {
                 dizi[sonraki]=a;         //karma��kl�k O(1) dir. Sadece atama i�lemi yap�l�yor.
                 sonraki++; 
             }        
};

int main(int argc, char *argv[])
{
    myClass obj1;
    myClass obj2;
    obj1.ekle(3);
    obj1.ekle(2);
    obj2.ekle(10);
    obj2.ekle(11);
    obj1=obj2;
    for(int i=0;i< obj1.sonraki; i++)
    {
            cout<<obj1.dizi[i];
            cout<<endl;
    } 
    system("PAUSE");
    return EXIT_SUCCESS;
}

#include <stdio.h>
#include <stdlib.h>

int x;
unsigned int y;
int counter=0;

int usAl(int x, unsigned int y)
{
    int sonuc = 1;
    while (y > 0)
    {
        if (y & 1){
            sonuc = sonuc*x;
            }
        y = y/2;
        x = x*x;
        counter+=1;
    }
    return sonuc;
}

int main(int argc, char *argv[])
{
    printf("X sayisini giriniz : ");
    scanf("%d",&x);
    printf("Y sayisini giriniz : ");
    scanf("%d",&y);
    int sonuc = usAl(x,y);
    printf("Sonuc : %d \nAdim Sayisi : %d\n",sonuc,counter);
  
  system("PAUSE");	
  return 0;
}

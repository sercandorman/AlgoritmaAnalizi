#include <stdio.h>
#include <stdlib.h>

int sayac,x,y,sonuc=1,i=0;

int pow_cmplx_O_n(int x, int y){
    for (i=1;i<y+1;i++){
        sonuc=sonuc*x;
        sayac=sayac+1;
        }
        return sonuc;
    }
    
int main(int argc, char *argv[])
{
  printf("x : ");
  scanf("%d",&x);
  printf("y : ");
  scanf("%d",&y);
  sonuc = pow_cmplx_O_n(x,y);
  printf("Sonuc : %d \nAdim Sayisi = %d \n",sonuc,sayac);
  
  system("PAUSE");	
  return 0;
}

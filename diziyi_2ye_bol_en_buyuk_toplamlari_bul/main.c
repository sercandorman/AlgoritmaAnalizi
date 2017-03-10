#include <stdio.h>
#include <stdlib.h>

int dizi1[]= {4,-3,2,1,6,-1,-2,4};
int dizi2[];
int dizi3[];
    
int main(int argc, char *argv[])
{
    int i=0;
    int j=0;
    
    int diziBoyutu = sizeof(dizi1) / sizeof(dizi1[0]);
    printf("Dizi uzunlugu : %d \n",diziBoyutu);
    //----------------------------------------------------    
    for (i=diziBoyutu/2;i<diziBoyutu;i++){
        dizi2[j] = dizi1[i];
        j++;
        }
    for (i=(diziBoyutu/2)-1;i>=0;i--){
        dizi3[i] = dizi1[i]; 
        }
    //----------------------------------------------------    
    printf("Dizi 2 elemanlari :");
    for (i=0;i<4;i++){
        printf("%d ",dizi2[i]);
        }
    printf("\n");
    //----------------------------------------------------    
    printf("Dizi 2 en buyuk toplam : ");
    int eb=dizi2[0];
    int toplamlar=0;
    for (i=0;i<4;i++){
        toplamlar= toplamlar+dizi2[i];
        if (toplamlar>eb){
                          eb=toplamlar;
                          }
        }
    printf("%d ",eb);
    printf("\n");
    //----------------------------------------------------
    printf("Dizi 3 en buyuk toplam : ");
    int eb2=dizi3[3];
    int toplamlar2=0;
    for (i=3;i>=0;i--){
        toplamlar2= toplamlar2+dizi3[i];
        if (toplamlar>eb2){
                          eb2=toplamlar2;
                          }
        }
    printf("%d ",eb2);
    printf("\n");
    //----------------------------------------------------    
    printf("Iki Dizinin En Buyuklerinin Toplami = %d \n",eb+eb2);
    //----------------------------------------------------  
    printf("Dizi 3 elemanlari :");
    for (i=0;i<4;i++){
        printf("%d ",dizi3[i]);
        }
    printf("\n");
    //---------------------------------------------------- 

  system("PAUSE");	
  return 0;
}

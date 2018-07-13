int x = 300; 
int a = 1000;
void setup() {
  size(1500, 1000);
}
void draw() {
  noFill();
  
  for(int j = 0; j < 20; j++) {
    background(255);
  int w = 25;
  int d = 25;
  
  for(int i = 0; i < 22; i++){
   ellipse(x, 500, w+= 25, d+=25);
  }
  x+=1;
  int e = 25;
  int g = 25;
 
  for(int i = 0; i < 22; i++) {
   ellipse(a, 500, e+=25, g+=25); 
  }
  a-=1;
  }
  }
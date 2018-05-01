#include<stdio.h>

struct card
{
int type;
int count;
int address;
char empty;
char *inst;
int seqno;
};

void main()
{
struct card t[3];
int i;
t[0].type=0;
t[0].count=4;
t[0].address=1000;
t[0].empty='-';
t[0].inst="A 1,2";
t[0].seqno=1;

t[1].type=0;
t[1].count=4;
t[1].address=1004;
t[1].empty='-';
t[1].inst="A 2,3";
t[1].seqno=2;

t[2].type=1;
t[2].count=0;
t[2].address=t[0].address;
t[2].empty='-';
t[2].inst="-";
t[2].seqno=3;

for(i=0;i<3;i++)
{
if(t[i].type==0)
printf("%d  %s\n",t[i].address,t[i].inst);
else
printf("Control transfer to %d\n",t[i].address);
}
}













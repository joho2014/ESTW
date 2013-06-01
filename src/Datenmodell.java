public class Datenmodell
{
    private Gleisstueck g0,g1,g2,g3,g4,g5,g6,g7,g8,g9,g10,g11,g12,g13,g14,g15,g16,g17,g18,g19,g20,g21,g22,g23,g24,g25,g26,g27,g28, g29;
    private Weiche w0,wnZ,wvZ,w1,w2,w3,w5,w6,w7,w8,wvnB,w10,w11,w12,wvP,wnP,wnL,wvL,w13,w14,w15,w16,w40,w39,w44,w43,w38,w37,w42,w41,w17;
    private Signal s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17,s18,s20,s21,s22,s25,s26,s30,s31;
    public Signal[]s;
    public Weiche[]w;
    
    public Datenmodell()
    {
        g0=new Gleisstueck("Gleisstueck 0", 0, w0, w0);
        g1=new Gleisstueck("Gleisstueck 1", 1, w3, w5);
        g2=new Gleisstueck("Gleisstueck 2", 1, w5, wvnB);
        g3=new Gleisstueck("Gleisstueck 3", 1, w44, w6);
        g4=new Gleisstueck("Gleisstueck 4", 1, w43, w6);
        g5=new Gleisstueck("Gleisstueck 5", 1, wnZ, w1);
        g6=new Gleisstueck("Gleisstueck 6", 1, w1, w7);
        g7=new Gleisstueck("Gleisstueck 7", 1, w7, w11);
        g8=new Gleisstueck("Gleisstueck 8", 1, w11, wvP);
        g9=new Gleisstueck("Gleisstueck 9", 1, wvZ, w2);
        g10=new Gleisstueck("Gleisstueck 10", 1, w2, w8);
        g11=new Gleisstueck("Gleisstueck 11", 1, w8, w10);
        g12=new Gleisstueck("Gleisstueck 12", 1, w12, wnP);
        g13=new Gleisstueck("Gleisstueck 13", 1, wnL, w13);
        g14=new Gleisstueck("Gleisstueck 14", 1, w13, w15);
        g15=new Gleisstueck("Gleisstueck 15", 1, w15, w40);
        g16=new Gleisstueck("Gleisstueck 16", 1, w40, w44);
        g17=new Gleisstueck("Gleisstueck 17", 1, wvL, w14);
        g18=new Gleisstueck("Gleisstueck 18", 1, w14, w16);
        g19=new Gleisstueck("Gleisstueck 19", 1, w16, w39);
        g20=new Gleisstueck("Gleisstueck 20", 1, w39, w38);
        g21=new Gleisstueck("Gleisstueck 21", 1, w38, w42);
        g22=new Gleisstueck("Gleisstueck 22", 1, w42, w43);
        g23=new Gleisstueck("Gleisstueck 23", 1, w17, w37);
        g24=new Gleisstueck("Gleisstueck 24", 1, w37, w41);
        g25=new Gleisstueck("Gleisstueck 25", 1, w41, w10);
        g26=new Gleisstueck("Gleisstueck 26", 1, w10, w12);
        g27=new Gleisstueck("Gleisstueck 27", 1, w1, w3);
        g28=new Gleisstueck("Gleisstueck 28", 1, w6, w5);
        g28=new Gleisstueck("Gleisstueck 29", 1, w16, w17);
       

        w0=new Weiche("Weiche 0",g0,g0,g0);
        wnZ=new Weiche("Weiche nZ",g5,g5,g0);
        wvZ=new Weiche("Weiche vZ",g9,g9,g0);
        w1=new Weiche("Weiche 1",g5,g9,g27);
        w2=new Weiche("Weiche 2",g10,g27,g9);
        w3=new Weiche("Weiche 3",g6,g1,g27);
        w5=new Weiche("Weiche 5",g28,g1,g2);
        w6=new Weiche("Weiche 6",g3,g4,g28);
        w7=new Weiche("Weiche 7",g7,g11,g6);
        w8=new Weiche("Weiche 8",g10,g6,g11);
        wvnB=new Weiche("Weiche vnB",g2,g2,g0);
        w10=new Weiche("Weiche 10",g11,g25,g26);
        w11=new Weiche("Weiche 11",g7,g26,g8);
        w12=new Weiche("Weiche 12",g8,g12,g26);
        wvP=new Weiche("Weiche vP",g8,g8,g0);
        wnP=new Weiche("Weiche nP",g0,g0,g12);
        wnL=new Weiche("Weiche nL",g0,g0,g13);
        wvL=new Weiche("Weiche vL",g17,g17,g0);
        w13=new Weiche("Weiche 13",g13,g17,g14);
        w14=new Weiche("Weiche 14",g18,g14,g17);
        w15=new Weiche("Weiche 15",g15,g19,g14);
        w16=new Weiche("Weiche 16",g18,g14,g29);
        w40=new Weiche("Weiche 40",g16,g20,g15);
        w39=new Weiche("Weiche 39",g15,g19,g20);
        w44=new Weiche("Weiche 44",g22,g16,g3);
        w43=new Weiche("Weiche 43",g4,g3,g22);
        w38=new Weiche("Weiche 38",g21,g24,g20);
        w37=new Weiche("Weiche 37",g23,g20,g24);
        w42=new Weiche("Weiche 42",g21,g24,g22);
        w41=new Weiche("Weiche 41",g25,g22,g24);
        w17=new Weiche("Weiche 17",g19,g23,g29);


        s1=new Signal("Signal 1");
        s2=new Signal("Signal 2");
        s3=new Signal("Signal 3");
        s4=new Signal("Signal 4");
        s5=new Signal("Signal 5");
        s6=new Signal("Signal 6");
        s7=new Signal("Signal 7");
        s8=new Signal("Signal 8");
        s9=new Signal("Signal 9");
        s10=new Signal("Signal 10");
        s11=new Signal("Signal 11");
        s12=new Signal("Signal 12");
        s13=new Signal("Signal 13");
        s14=new Signal("Signal 14");
        s15=new Signal("Signal 15");
        s16=new Signal("Signal 16");
        s17=new Signal("Signal 17");
        s18=new Signal("Signal 18");
        s20=new Signal("Signal 20");
        s21=new Signal("Signal 21");
        s22=new Signal("Signal 22");
        s25=new Signal("Signal 25");
        s26=new Signal("Signal 26");
        s30=new Signal("Signal 30");
        s31=new Signal("Signal 31");
        

        s= new Signal[25];
        s[0]=s1;
        s[1]=s2;
        s[2]=s3;
        s[3]=s4;
        s[4]=s5;
        s[5]=s6;
        s[6]=s7;
        s[7]=s8;
        s[8]=s9;
        s[9]=s10;
        s[10]=s11;
        s[11]=s12;
        s[12]=s13;
        s[13]=s14;
        s[14]=s15;
        s[15]=s16;
        s[16]=s17;
        s[17]=s18;
        s[18]=s20;
        s[19]=s21;
        s[20]=s22;
        s[21]=s25;
        s[22]=s26;
        s[23]=s30;
        s[24]=s31;
        
        w= new Weiche[31];
        w[0]=w0;
        w[1]=wnZ;
        w[2]=wvZ;
        w[3]=w1;
        w[4]=w2;
        w[5]=w3;
        w[6]=w5;
        w[7]=w6;
        w[8]=w7;
        w[9]=w8;
        w[10]=wvnB;
        w[11]=w10;
        w[12]=w11;
        w[13]=w12;
        w[14]=wvP;
        w[15]=wnP;
        w[16]=wnL;
        w[17]=wvL;
        w[18]=w13;
        w[19]=w14;
        w[20]=w15;
        w[21]=w16;
        w[22]=w40;
        w[23]=w39;
        w[24]=w44;
        w[25]=w43;
        w[26]=w38;
        w[27]=w37;
        w[28]=w42;
        w[29]=w41;
        w[30]=w17;
        
        
    }
}

public class Datenmodell
{
    private Gleisstueck g1,g2,g3,g4,g5,g6,g7,g8,g9,g10,g11,g12,g13,g14,g15,g16,g17,g18,g19,g20,g21,g22,g23,g24,g25,g26,g27,g28, g29;
    private Weiche w1,w2,w3,w5,w6,w7,w8,w10,w11,w12,w13,w14,w15,w16,w40,w39,w44,w43,w38,w37,w42,w41,w17;
    private Signal s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17,s18,s20,s21,s22,s25,s26,s30,s31;
    public Signal[]s;/**Array, das alle Signale enth�lt*/
    public Weiche[]w;/**Array, das alle Weichen enth�lt*/
    public Gleisstueck[]g;/**Array, das alle Gleissstuecke enth�lt*/
    
    /** Datenmodell:
     * Konstruktor Datenmodell
     */
    public Datenmodell()
    {
        g1=new Gleisstueck("Gleisstueck 1", 640, w3, w5);
        g2=new Gleisstueck("Gleisstueck 2", 320, w5, null);
        g3=new Gleisstueck("Gleisstueck 3", 590, w44, w6);
        g4=new Gleisstueck("Gleisstueck 4", 190, w43, w6);
        g5=new Gleisstueck("Gleisstueck 5", 210, null, w1);
        g6=new Gleisstueck("Gleisstueck 6", 260, w1, w7);
        g7=new Gleisstueck("Gleisstueck 7", 730, w7, w11);
        g8=new Gleisstueck("Gleisstueck 8", 200, w11, null);
        g9=new Gleisstueck("Gleisstueck 9", 190, null, w2);
        g10=new Gleisstueck("Gleisstueck 10", 570, w2, w8);
        g11=new Gleisstueck("Gleisstueck 11", 700, w8, w10);
        g12=new Gleisstueck("Gleisstueck 12", 220, w12, null);
        g13=new Gleisstueck("Gleisstueck 13", 260, null, w13);
        g14=new Gleisstueck("Gleisstueck 14", 60, w13, w15);
        g15=new Gleisstueck("Gleisstueck 15", 690, w15, w40);
        g16=new Gleisstueck("Gleisstueck 16", 330, w40, w44);
        g17=new Gleisstueck("Gleisstueck 17", 250, null, w14);
        g18=new Gleisstueck("Gleisstueck 18", 80, w14, w16);
        g19=new Gleisstueck("Gleisstueck 19", 690, w16, w39);
        g20=new Gleisstueck("Gleisstueck 20", 60, w39, w38);
        g21=new Gleisstueck("Gleisstueck 21", 51, w38, w42);
        g22=new Gleisstueck("Gleisstueck 22", 50, w42, w43);
        g23=new Gleisstueck("Gleisstueck 23", 690, w17, w37);
        g24=new Gleisstueck("Gleisstueck 24", 120, w37, w41);
        g25=new Gleisstueck("Gleisstueck 25", 1220, w41, w10);
        g26=new Gleisstueck("Gleisstueck 26", 60, w10, w12);
        g27=new Gleisstueck("Gleisstueck 27", 50, w1, w3);
        g28=new Gleisstueck("Gleisstueck 28", 50, w6, w5);
        g29=new Gleisstueck("Gleisstueck 29", 60, w16, w17);
       
        w1=new Weiche("Weiche 1",g5,g9,g27);
        w2=new Weiche("Weiche 2",g10,g27,g9);
        w3=new Weiche("Weiche 3",g6,g1,g27);
        w5=new Weiche("Weiche 5",g28,g1,g2);
        w6=new Weiche("Weiche 6",g3,g4,g28);
        w7=new Weiche("Weiche 7",g7,g11,g6);
        w8=new Weiche("Weiche 8",g10,g6,g11);
        w10=new Weiche("Weiche 10",g11,g25,g26);
        w11=new Weiche("Weiche 11",g7,g26,g8);
        w12=new Weiche("Weiche 12",g8,g12,g26);
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


        s1=new Signal("Signal 1", null, true);
        s2=new Signal("Signal 2", null, true);
        s3=new Signal("Signal 3", null, true);
        s4=new Signal("Signal 4", null, true);
        s5=new Signal("Signal 5", null, true);
        s6=new Signal("Signal 6", null, true);
        s7=new Signal("Signal 7", null, true);
        s8=new Signal("Signal 8", null, true);
        s9=new Signal("Signal 9", null, true);
        s10=new Signal("Signal 10", null, true);
        s11=new Signal("Signal 11", null, true);
        s12=new Signal("Signal 12", null, true);
        s13=new Signal("Signal 13", null, true);
        s14=new Signal("Signal 14", null, true);
        s15=new Signal("Signal 15", null, true);
        s16=new Signal("Signal 16", null, true);
        s17=new Signal("Signal 17", null, true);
        s18=new Signal("Signal 18", null, true);
        s20=new Signal("Signal 20", null, true);
        s21=new Signal("Signal 21", null, true);
        s22=new Signal("Signal 22", null, true);
        s25=new Signal("Signal 25", null, true);
        s26=new Signal("Signal 26", null, true);
        s30=new Signal("Signal 30", null, true);
        s31=new Signal("Signal 31", null, true);

        g1.setSignal(null);
        g2.setSignal(null);
        g3.setSignal(null);
        g4.setSignal(null);
        g5.setSignal(null);
        g6.setSignal(null);
        g7.setSignal(null);
        g8.setSignal(null);
        g9.setSignal(null);
        g10.setSignal(null);
        g11.setSignal(null);
        g12.setSignal(null);
        g13.setSignal(null);
        g14.setSignal(null);
        g15.setSignal(null);
        g16.setSignal(null);
        g17.setSignal(null);
        g18.setSignal(null);
        g19.setSignal(null);
        g20.setSignal(null);
        g21.setSignal(null);
        g22.setSignal(null);
        g23.setSignal(null);
        g24.setSignal(null);
        g25.setSignal(null);
        g26.setSignal(null);
        g27.setSignal(null);
        g28.setSignal(null);
        g29.setSignal(null);

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
        
        w= new Weiche[23];
        w[0]=w1;
        w[1]=w2;
        w[2]=w3;
        w[3]=w5;
        w[4]=w6;
        w[5]=w7;
        w[6]=w8; 
        w[7]=w10;
        w[8]=w11;
        w[9]=w12;
        w[10]=w13;
        w[11]=w14;
        w[12]=w15;
        w[13]=w16;
        w[14]=w17;
        w[15]=w37;
        w[16]=w38;
        w[17]=w39;
        w[18]=w40;
        w[19]=w41;
        w[20]=w42;
        w[21]=w43;
        w[22]=w44;
       
        
        g= new Gleisstueck[30];
        g[1]=g1;
        g[2]=g2;
        g[3]=g3;
        g[4]=g4;
        g[5]=g5;
        g[6]=g6;
        g[7]=g7;
        g[8]=g8;
        g[9]=g9;
        g[10]=g10;
        g[11]=g11;
        g[12]=g12;
        g[13]=g13;
        g[14]=g14;
        g[15]=g15;
        g[16]=g16;
        g[17]=g17;
        g[18]=g18;
        g[19]=g19;
        g[20]=g20;
        g[21]=g21;
        g[22]=g22;
        g[23]=g23;
        g[24]=g24;
        g[25]=g25;
        g[26]=g26;
        g[27]=g27;
        g[28]=g28;
        g[29]=g29;

       
   
        
    }
    
    /** Datenmodell:
     * Man erhaelt die Weiche mit der Arraynummer 'nummer'.
     * @param nummer Arraynummer
     */
    public Weiche getWeiche(int nummer)
    {
        if(nummer < w.length) return w[nummer];
        return null;
    }
    
    /** Datenmodell:
     * Man erhaelt das Signal mit der Arraynummer 'nummer'.
     * @param nummer Arraynummer
     */
    public Signal getSignal(int nummer)
    {
        if(nummer < s.length) return s[nummer];
        return null;
    }
    
    /** Datenmodell:
     * Man erhaelt das Gleisstueck mit der Arraynummer 'nummer'.
     * @param nummer Arraynummer
     */
    public Gleisstueck getGleisstueck(int nummer)
    {
        if(nummer < g.length) return g[nummer];
        return null;
    }
}

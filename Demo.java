
//API : http://mabe02.github.io/lanterna/apidocs/2.1/
import com.googlecode.lanterna.terminal.Terminal.SGR;
import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.input.Key.Kind;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.terminal.Terminal.Color;
import com.googlecode.lanterna.terminal.TerminalSize;
import com.googlecode.lanterna.LanternaException;
import com.googlecode.lanterna.input.CharacterPattern;
import com.googlecode.lanterna.input.InputDecoder;
import com.googlecode.lanterna.input.InputProvider;
import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.input.KeyMappingProfile;
import java.util.ArrayList;

public class Demo{
  static ArrayList<Wall> grid = new ArrayList<Wall>();
  static ArrayList<Greebler> greeblers = new ArrayList<Greebler>();
  static ArrayList<Integer> killed = new ArrayList<Integer>();
  static ArrayList<Baby> babies = new ArrayList<Baby>();
  static Player one = new Player(1000, 100, 10, 10, "wallie", '\u00a6', 4);
  static Map map = new Map(1);


  //perimeter
  //top
  static Wall side0 = new Wall(0,0, "up");
  static Wall side1 = new Wall(1,0, "");
  static Wall side2 = new Wall(2,0, "");
  static Wall side3 = new Wall(3,0, "");
  static Wall side4 = new Wall(4,0, "");
  static Wall side5 = new Wall(5,0, "");
  static Wall side6 = new Wall(6,0, "");
  static Wall side7 = new Wall(7,0, "");
  static Wall side8 = new Wall(8,0, "");
  static Wall side9 = new Wall(9,0, "");
  static Wall side10 = new Wall(10,0, "");
  static Wall side11 = new Wall(11,0, "");
  static Wall side12 = new Wall(12,0, "");
  static Wall side13 = new Wall(13,0, "");
  static Wall side14 = new Wall(14,0, "");
  static Wall side15 = new Wall(15,0, "");
  static Wall side16 = new Wall(16,0, "");
  static Wall side17 = new Wall(17,0, "");
  static Wall side18 = new Wall(18,0, "");
  static Wall side19 = new Wall(19,0, "");
  static Wall side20 = new Wall(20,0, "");
  static Wall side21 = new Wall(21,0, "");
  static Wall side22 = new Wall(22,0, "");
  static Wall side23 = new Wall(23,0, "");
  static Wall side24 = new Wall(24,0, "");
  static Wall side25 = new Wall(25,0, "");
  static Wall side26 = new Wall(26,0, "");
  static Wall side27 = new Wall(27,0, "");
  static Wall side28 = new Wall(28,0, "");
  static Wall side29 = new Wall(29,0, "");
  static Wall side30 = new Wall(30,0, "");
  static Wall side31 = new Wall(31,0, "");
  static Wall side32 = new Wall(32,0, "");
  static Wall side33 = new Wall(33,0, "");
  static Wall side34 = new Wall(34,0, "");
  static Wall side35 = new Wall(35,0, "");
  static Wall side36 = new Wall(36,0, "");
  static Wall side37 = new Wall(37,0, "");
  static Wall side38 = new Wall(38,0, "");
  static Wall side39 = new Wall(39,0, "");
  static Wall side40 = new Wall(40,0, "");
  static Wall side41 = new Wall(41,0, "");
  static Wall side42 = new Wall(42,0, "");
  static Wall side43 = new Wall(43,0, "");
  static Wall side44 = new Wall(44,0, "");
  static Wall side45 = new Wall(45,0, "");
  static Wall side46 = new Wall(46,0, "");
  static Wall side47 = new Wall(47,0, "");
  static Wall side48 = new Wall(48,0, "");
  static Wall side49 = new Wall(49,0, "");
  static Wall side50 = new Wall(50,0, "");
  static Wall side51 = new Wall(51,0, "");
  static Wall side52 = new Wall(52,0, "");
  static Wall side53 = new Wall(53,0, "");
  static Wall side54 = new Wall(54,0, "");
  static Wall side55 = new Wall(55,0, "");
  static Wall side56 = new Wall(56,0, "");
  static Wall side57 = new Wall(57,0, "");
  static Wall side58 = new Wall(58,0, "");
  static Wall side59 = new Wall(59,0, "");
  static Wall side60 = new Wall(60,0, "");
  static Wall side61 = new Wall(61,0, "");
  static Wall side62 = new Wall(62,0, "");
  static Wall side63 = new Wall(63,0, "");
  static Wall side64 = new Wall(64,0, "");
  static Wall side65 = new Wall(65,0, "");
  static Wall side66 = new Wall(66,0, "");
  static Wall side67 = new Wall(67,0, "");
  static Wall side68 = new Wall(68,0, "");
  static Wall side69 = new Wall(69,0, "");
  static Wall side70 = new Wall(70,0, "");
  static Wall side71 = new Wall(71,0, "");
  static Wall side72 = new Wall(72,0, "");
  static Wall side73 = new Wall(73,0, "");
  static Wall side74 = new Wall(74,0, "");
  static Wall side75 = new Wall(75,0, "");
  static Wall side76 = new Wall(76,0, "");
  static Wall side77 = new Wall(77,0, "");
  static Wall side78 = new Wall(78,0, "");
  static Wall side79 = new Wall(79,0, "up");

//  left side
  static Wall side80 = new Wall(0,1, "up");
  static Wall side81 = new Wall(0,2, "up");
  static Wall side82 = new Wall(0,3, "up");
  static Wall side83 = new Wall(0,4, "up");
  static Wall side84 = new Wall(0,5, "up");
  static Wall side85 = new Wall(0,6, "up");
  static Wall side86 = new Wall(0,7, "up");
  static Wall side87 = new Wall(0,8, "up");
  static Wall side88 = new Wall(0,9, "up");
  static Wall side89 = new Wall(0,10, "up");
  static Wall side90 = new Wall(0,11, "up");
  static Wall side91 = new Wall(0,12, "up");
  static Wall side92 = new Wall(0,13, "up");
  static Wall side93 = new Wall(0,14, "up");
  static Wall side94 = new Wall(0,15, "up");
  static Wall side95 = new Wall(0,16, "up");
  static Wall side96 = new Wall(0,17, "up");
  static Wall side97 = new Wall(0,18, "up");
  static Wall side98 = new Wall(0,19, "up");
  static Wall side99 = new Wall(0,20, "up");
  static Wall side100 = new Wall(0,21, "up");
  static Wall side101 = new Wall(0,22, "up");
  static Wall side102 = new Wall(0,23, "up");
  static Wall side103 = new Wall(0,24, "up");
  static Wall side104 = new Wall(0,25, "up");
  static Wall side105 = new Wall(0,26, "up");
  static Wall side106 = new Wall(0,27, "up");
  static Wall side107 = new Wall(0,28, "up");
  static Wall side108 = new Wall(0,29, "up");
  static Wall side109 = new Wall(0,30, "up");
  static Wall side110 = new Wall(0,31, "up");
  static Wall side111 = new Wall(0,32, "up");
  static Wall side112 = new Wall(0,33, "up");
  static Wall side113 = new Wall(0,34, "up");
  static Wall side114 = new Wall(0,35, "up");
  static Wall side115 = new Wall(0,36, "up");
  static Wall side116 = new Wall(0,37, "up");
  static Wall side117 = new Wall(0,38, "up");
  static Wall side118 = new Wall(0,39, "up");
  static Wall side119 = new Wall(0,40, "up");
  static Wall side120 = new Wall(0,41, "up");
  static Wall side121 = new Wall(0,42, "up");
  static Wall side122 = new Wall(0,43, "up");
  static Wall side123 = new Wall(0,44, "up");
  static Wall side124 = new Wall(0,45, "up");
  static Wall side125 = new Wall(0,46, "up");
  static Wall side126 = new Wall(0,47, "up");
  static Wall side127 = new Wall(0,48, "up");
  static Wall side128 = new Wall(0,49, "up");

  //bottom
  static Wall side129 = new Wall(0,49, "up");
  static Wall side130 = new Wall(1,49, "");
  static Wall side131 = new Wall(2,49, "");
  static Wall side132 = new Wall(3,49, "");
  static Wall side133 = new Wall(4,49, "");
  static Wall side134 = new Wall(5,49, "");
  static Wall side135 = new Wall(6,49, "");
  static Wall side136 = new Wall(7,49, "");
  static Wall side137 = new Wall(8,49, "");
  static Wall side138 = new Wall(9,49, "");
  static Wall side139 = new Wall(10,49, "");
  static Wall side140 = new Wall(11,49, "");
  static Wall side141 = new Wall(12,49, "");
  static Wall side142 = new Wall(13,49, "");
  static Wall side143 = new Wall(14,49, "");
  static Wall side144 = new Wall(15,49, "");
  static Wall side145 = new Wall(16,49, "");
  static Wall side146 = new Wall(17,49, "");
  static Wall side147 = new Wall(18,49, "");
  static Wall side148 = new Wall(19,49, "");
  static Wall side149 = new Wall(20,49, "");
  static Wall side150 = new Wall(21,49, "");
  static Wall side151 = new Wall(22,49, "");
  static Wall side152 = new Wall(23,49, "");
  static Wall side153 = new Wall(24,49, "");
  static Wall side154 = new Wall(25,49, "");
  static Wall side155 = new Wall(26,49, "");
  static Wall side156 = new Wall(27,49, "");
  static Wall side157 = new Wall(28,49, "");
  static Wall side158 = new Wall(29,49, "");
  static Wall side159 = new Wall(30,49, "");
  static Wall side160 = new Wall(31,49, "");
  static Wall side161 = new Wall(32,49, "");
  static Wall side162 = new Wall(33,49, "");
  static Wall side163 = new Wall(34,49, "");
  static Wall side164 = new Wall(35,49, "");
  static Wall side165 = new Wall(36,49, "");
  static Wall side166 = new Wall(37,49, "");
  static Wall side167 = new Wall(38,49, "");
  static Wall side168 = new Wall(39,49, "");
  static Wall side169 = new Wall(40,49, "");
  static Wall side170 = new Wall(41,49, "");
  static Wall side171 = new Wall(42,49, "");
  static Wall side172 = new Wall(43,49, "");
  static Wall side173 = new Wall(44,49, "");
  static Wall side174 = new Wall(45,49, "");
  static Wall side175 = new Wall(46,49, "");
  static Wall side176 = new Wall(47,49, "");
  static Wall side177 = new Wall(48,49, "");
  static Wall side178 = new Wall(49,49, "");
  static Wall side179 = new Wall(50,49, "");
  static Wall side180 = new Wall(51,49, "");
  static Wall side181 = new Wall(52,49, "");
  static Wall side182 = new Wall(53,49, "");
  static Wall side183 = new Wall(54,49, "");
  static Wall side184 = new Wall(55,49, "");
  static Wall side185 = new Wall(56,49, "");
  static Wall side186 = new Wall(57,49, "");
  static Wall side187 = new Wall(58,49, "");
  static Wall side188 = new Wall(59,49, "");
  static Wall side189 = new Wall(60,49, "");
  static Wall side190 = new Wall(61,49, "");
  static Wall side191 = new Wall(62,49, "");
  static Wall side192 = new Wall(63,49, "");
  static Wall side193 = new Wall(64,49, "");
  static Wall side194 = new Wall(65,49, "");
  static Wall side195 = new Wall(66,49, "");
  static Wall side196 = new Wall(67,49, "");
  static Wall side197 = new Wall(68,49, "");
  static Wall side198 = new Wall(69,49, "");
  static Wall side199 = new Wall(70,49, "");
  static Wall side200 = new Wall(71,49, "");
  static Wall side201 = new Wall(72,49, "");
  static Wall side202 = new Wall(73,49, "");
  static Wall side203 = new Wall(74,49, "");
  static Wall side204 = new Wall(75,49, "");
  static Wall side205 = new Wall(76,49, "");
  static Wall side206 = new Wall(77,49, "");
  static Wall side207 = new Wall(78,49, "");
  static Wall side208 = new Wall(79,49, "up");

  //right side
  static Wall side209 = new Wall(79,1, "up");
  static Wall side210 = new Wall(79,2, "up");
  static Wall side211 = new Wall(79,3, "up");
  static Wall side212 = new Wall(79,4, "up");
  static Wall side213 = new Wall(79,5, "up");
  static Wall side214 = new Wall(79,6, "up");
  static Wall side215 = new Wall(79,7, "up");
  static Wall side216 = new Wall(79,8, "up");
  static Wall side217 = new Wall(79,9, "up");
  static Wall side218 = new Wall(79,10, "up");
  static Wall side219 = new Wall(79,11, "up");
  static Wall side220 = new Wall(79,12, "up");
  static Wall side221 = new Wall(79,13, "up");
  static Wall side222 = new Wall(79,14, "up");
  static Wall side223 = new Wall(79,15, "up");
  static Wall side224 = new Wall(79,16, "up");
  static Wall side225 = new Wall(79,17, "up");
  static Wall side226 = new Wall(79,18, "up");
  static Wall side227 = new Wall(79,19, "up");
  static Wall side228 = new Wall(79,20, "up");
  static Wall side229 = new Wall(79,21, "up");
  static Wall side230 = new Wall(79,22, "up");
  static Wall side231 = new Wall(79,23, "up");
  static Wall side232 = new Wall(79,24, "up");
  static Wall side233 = new Wall(79,25, "up");
  static Wall side234 = new Wall(79,26, "up");
  static Wall side235 = new Wall(79,27, "up");
  static Wall side236 = new Wall(79,28, "up");
  static Wall side237 = new Wall(79,29, "up");
  static Wall side238 = new Wall(79,30, "up");
  static Wall side239 = new Wall(79,31, "up");
  static Wall side240 = new Wall(79,32, "up");
  static Wall side241 = new Wall(79,33, "up");
  static Wall side242 = new Wall(79,34, "up");
  static Wall side243 = new Wall(79,35, "up");
  static Wall side244 = new Wall(79,36, "up");
  static Wall side245 = new Wall(79,37, "up");
  static Wall side246 = new Wall(79,38, "up");
  static Wall side247 = new Wall(79,39, "up");
  static Wall side248 = new Wall(79,40, "up");
  static Wall side249 = new Wall(79,41, "up");
  static Wall side250 = new Wall(79,42, "up");
  static Wall side251 = new Wall(79,43, "up");
  static Wall side252 = new Wall(79,44, "up");
  static Wall side253 = new Wall(79,45, "up");
  static Wall side254 = new Wall(79,46, "up");
  static Wall side255 = new Wall(79,47, "up");
  static Wall side256 = new Wall(79,48, "up");
  static Wall side257 = new Wall(79,49, "up");

  static Greebler greeb1 = new Greebler(20, 15);
  static Greebler greeb2 = new Greebler(30,20);
  static Baby baby1 = new Baby(40, 10);

  public static void fillScreen(Terminal t){
    //top
    grid.add(side0);
    grid.add(side1);
    grid.add(side2);
    grid.add(side3);
    grid.add(side4);
    grid.add(side5);
    grid.add(side6);
    grid.add(side7);
    grid.add(side8);
    grid.add(side9);
    grid.add(side10);
    grid.add(side11);
    grid.add(side12);
    grid.add(side13);
    grid.add(side14);
    grid.add(side15);
    grid.add(side16);
    grid.add(side17);
    grid.add(side18);
    grid.add(side19);
    grid.add(side20);
    grid.add(side21);
    grid.add(side22);
    grid.add(side23);
    grid.add(side24);
    grid.add(side25);
    grid.add(side26);
    grid.add(side27);
    grid.add(side28);
    grid.add(side29);
    grid.add(side30);
    grid.add(side31);
    grid.add(side32);
    grid.add(side33);
    grid.add(side34);
    grid.add(side35);
    grid.add(side36);
    grid.add(side37);
    grid.add(side38);
    grid.add(side39);
    grid.add(side40);
    grid.add(side41);
    grid.add(side42);
    grid.add(side43);
    grid.add(side44);
    grid.add(side45);
    grid.add(side46);
    grid.add(side47);
    grid.add(side48);
    grid.add(side49);
    grid.add(side50);
    grid.add(side51);
    grid.add(side52);
    grid.add(side53);
    grid.add(side54);
    grid.add(side55);
    grid.add(side56);
    grid.add(side57);
    grid.add(side58);
    grid.add(side59);
    grid.add(side60);
    grid.add(side61);
    grid.add(side62);
    grid.add(side63);
    grid.add(side64);
    grid.add(side65);
    grid.add(side66);
    grid.add(side67);
    grid.add(side68);
    grid.add(side69);
    grid.add(side70);
    grid.add(side71);
    grid.add(side72);
    grid.add(side73);
    grid.add(side74);
    grid.add(side75);
    grid.add(side76);
    grid.add(side77);
    grid.add(side78);
    grid.add(side79);
    //left side
    grid.add(side80);
    grid.add(side81);
    grid.add(side82);
    grid.add(side83);
    grid.add(side84);
    grid.add(side85);
    grid.add(side86);
    grid.add(side87);
    grid.add(side88);
    grid.add(side89);
    grid.add(side90);
    grid.add(side91);
    grid.add(side92);
    grid.add(side93);
    grid.add(side94);
    grid.add(side95);
    grid.add(side96);
    grid.add(side97);
    grid.add(side98);
    grid.add(side99);
    grid.add(side100);
    grid.add(side101);
    grid.add(side102);
    grid.add(side103);
    grid.add(side104);
    grid.add(side105);
    grid.add(side106);
    grid.add(side107);
    grid.add(side108);
    grid.add(side109);
    grid.add(side110);
    grid.add(side111);
    grid.add(side112);
    grid.add(side113);
    grid.add(side114);
    grid.add(side115);
    grid.add(side116);
    grid.add(side117);
    grid.add(side118);
    grid.add(side119);
    grid.add(side120);
    grid.add(side121);
    grid.add(side122);
    grid.add(side123);
    grid.add(side124);
    grid.add(side125);
    grid.add(side126);
    grid.add(side127);
    grid.add(side128);

    //bottom
    grid.add(side129);
    grid.add(side130);
    grid.add(side131);
    grid.add(side132);
    grid.add(side133);
    grid.add(side134);
    grid.add(side135);
    grid.add(side136);
    grid.add(side137);
    grid.add(side138);
    grid.add(side139);
    grid.add(side140);
    grid.add(side141);
    grid.add(side142);
    grid.add(side143);
    grid.add(side144);
    grid.add(side145);
    grid.add(side146);
    grid.add(side147);
    grid.add(side148);
    grid.add(side149);
    grid.add(side150);
    grid.add(side151);
    grid.add(side152);
    grid.add(side153);
    grid.add(side154);
    grid.add(side155);
    grid.add(side156);
    grid.add(side157);
    grid.add(side158);
    grid.add(side159);
    grid.add(side160);
    grid.add(side161);
    grid.add(side162);
    grid.add(side163);
    grid.add(side164);
    grid.add(side165);
    grid.add(side166);
    grid.add(side167);
    grid.add(side168);
    grid.add(side169);
    grid.add(side170);
    grid.add(side171);
    grid.add(side172);
    grid.add(side173);
    grid.add(side174);
    grid.add(side175);
    grid.add(side176);
    grid.add(side177);
    grid.add(side178);
    grid.add(side179);
    grid.add(side180);
    grid.add(side181);
    grid.add(side182);
    grid.add(side183);
    grid.add(side184);
    grid.add(side185);
    grid.add(side186);
    grid.add(side187);
    grid.add(side188);
    grid.add(side189);
    grid.add(side190);
    grid.add(side191);
    grid.add(side192);
    grid.add(side193);
    grid.add(side194);
    grid.add(side195);
    grid.add(side196);
    grid.add(side197);
    grid.add(side198);
    grid.add(side199);
    grid.add(side200);
    grid.add(side201);
    grid.add(side202);
    grid.add(side203);
    grid.add(side204);
    grid.add(side205);
    grid.add(side206);
    grid.add(side207);
    grid.add(side208);

    //right side
    grid.add(side209);
    grid.add(side210);
    grid.add(side211);
    grid.add(side212);
    grid.add(side213);
    grid.add(side214);
    grid.add(side215);
    grid.add(side216);
    grid.add(side217);
    grid.add(side218);
    grid.add(side219);
    grid.add(side220);
    grid.add(side221);
    grid.add(side222);
    grid.add(side223);
    grid.add(side224);
    grid.add(side225);
    grid.add(side226);
    grid.add(side227);
    grid.add(side228);
    grid.add(side229);
    grid.add(side230);
    grid.add(side231);
    grid.add(side232);
    grid.add(side233);
    grid.add(side234);
    grid.add(side235);
    grid.add(side236);
    grid.add(side237);
    grid.add(side238);
    grid.add(side239);
    grid.add(side240);
    grid.add(side241);
    grid.add(side242);
    grid.add(side243);
    grid.add(side244);
    grid.add(side245);
    grid.add(side246);
    grid.add(side247);
    grid.add(side248);
    grid.add(side249);
    grid.add(side250);
    grid.add(side251);
    grid.add(side252);
    grid.add(side253);
    grid.add(side254);
    grid.add(side255);
    grid.add(side256);
    grid.add(side257);

    greeblers.add(greeb1);
    greeblers.add(greeb2);
    for (int i = 0; i < map.getMap().size(); i++){
      t.moveCursor(map.getMap().get(i).getwallX(), map.getMap().get(i).getwallY());
      t.putCharacter(map.getMap().get(i).getBarrier());
    }
    for(int l = 0; l < killed.size(); l++){
      greeblers.remove(killed.get(l));
    }
    babies.add(baby1);
    for(int i = 0; i < grid.size(); i++){
      t.moveCursor(grid.get(i).getwallX(), grid.get(i).getwallY());
      t.putCharacter(grid.get(i).getBarrier());
    }
    for(int j = 0; j < greeblers.size(); j++){
      t.moveCursor(greeblers.get(j).getX(), greeblers.get(j).getY());
      t.putCharacter(greeblers.get(j).getGraphic());
    }
    for(int k = 0; k < babies.size(); k++){
      t.moveCursor(babies.get(k).getX(), babies.get(k).getY());
      t.putCharacter(babies.get(k).getGraphic());
    }
  }

  public static void putString(int r, int c,Terminal t, String s){
		t.moveCursor(r,c);
		for(int i = 0; i < s.length();i++){
			t.putCharacter(s.charAt(i));
		}
	}

  public static void attack(Creature c){
    //saves index of greebler that is getting attacked
    int d =0;
    //checks from perspective of player for greeblers surrounding it and attacks
    //any that are in his/her proximity
    c.setDirection("right");
    if(checkAround(c)[1].equals("greebler")){
      for(int i = 0; i < greeblers.size(); i++){
        if(greeblers.get(i).getX() - 1 == c.getX() && c.getY() == greeblers.get(i).getY()){
          d = i;
        }
      }
      greeblers.get(d).subHealth(c.getDamage());
      if(greeblers.get(d).getHealth() <= 0){
        killed.add(d);
        greeblers.get(d).changeGraphic('\u0000');
        greeblers.get(d).setX(99);
        greeblers.get(d).setY(99);
      }
    }
    if(checkAround(c)[0].equals("player")){
      one.subHealth(c.getDamage());
    }


    c.setDirection("left");
    if(checkAround(c)[3].equals("greebler")){
      for(int j = 0; j < greeblers.size(); j++){
        if(greeblers.get(j).getX() + 1 == c.getX() && c.getY() == greeblers.get(j).getY()){
          d = j;
        }
      }
      greeblers.get(d).subHealth(c.getDamage());
      if(greeblers.get(d).getHealth() == 0){
        killed.add(d);
        greeblers.get(d).changeGraphic('\u0000');
        greeblers.get(d).setX(99);
        greeblers.get(d).setY(99);
      }
    }
    if(checkAround(c)[3].equals("player")){
      one.subHealth(c.getDamage());
    }



    c.setDirection("down");
    if(checkAround(c)[2].equals("greebler")){
      for(int k = 0; k < greeblers.size(); k++){
        if(greeblers.get(k).getX() == c.getX() && c.getY() == greeblers.get(k).getY() - 1){
          d = k;
        }
      }
      greeblers.get(d).subHealth(c.getDamage());
      if(greeblers.get(d).getHealth() == 0){
        killed.add(d);
        greeblers.get(d).changeGraphic('\u0000');
        greeblers.get(d).setX(99);
        greeblers.get(d).setY(99);
      }
    }
    if(checkAround(c)[2].equals("player")){
      one.subHealth(c.getDamage());
    }


    c.setDirection("up");
    if(checkAround(c)[0].equals("greebler")){
      for(int l = 0; l < greeblers.size(); l++){
        if(greeblers.get(l).getX() == c.getX() && c.getY() == greeblers.get(l).getY() + 1){
          d = l;
        }
      }
      greeblers.get(d).subHealth(c.getDamage());
      if(greeblers.get(d).getHealth() == 0){
        killed.add(d);
        greeblers.get(d).changeGraphic('\u0000');
        greeblers.get(d).setX(99);
        greeblers.get(d).setY(99);
      }
    }
    if(checkAround(c)[0].equals("player")){
      one.subHealth(c.getDamage());
    }


    //exits system if player is dead
    if(one.getHealth() <= 0){
      System.exit(1);
    }
  }
  //checks position in front of creature for a
  //creature, wall, or baby and returns a String with the
  //type of thing in front of it
  //commented out and moved to creature class
  public static String[] checkAround(Creature n){
    String[] surroundings = new String[4];
    for (int i = 0; i < grid.size(); i++){
      //Checks which direction the greebler is looking and then if there is a wall in fron of the creature
      if (grid.get(i).getwallX() == n.getX() && grid.get(i).getwallY() == n.getY() + 1){
        surroundings[0] = "wall";
      }
      if (grid.get(i).getwallX() == n.getX() && grid.get(i).getwallY() == n.getY() - 1){
        surroundings[2] = "wall";
      }
      if (grid.get(i).getwallX() == n.getX() + 1 && grid.get(i).getwallY() == n.getY()){
        surroundings[1] = "wall";
      }
      if (grid.get(i).getwallX() == n.getX() - 1 && grid.get(i).getwallY() == n.getY()){
        surroundings[3] = "wall";
      }
    }

    //Checks if there is a greebler in the direction of the creature
    for (int i = 0; i < greeblers.size(); i++){
      if (greeblers.get(i).getX() == n.getX() && greeblers.get(i).getY() - 1 == n.getY()){
        surroundings[0] = "greebler";
      }
      if (greeblers.get(i).getX() == n.getX() && greeblers.get(i).getY() + 1 == n.getY()){
        surroundings[2] = "greebler";
      }
      if (greeblers.get(i).getX() == n.getX() + 1 && greeblers.get(i).getY() == n.getY()){
        surroundings[1] = "greebler";
      }
      if (greeblers.get(i).getX() == n.getX() - 1 && greeblers.get(i).getY() == n.getY()){
        surroundings[3] = "greebler";
      }
    }

    //checks for babies in the immediate surroundings of the player
    for (int i = 0; i < babies.size(); i++){
      if (babies.get(i).getX() == n.getX() && babies.get(i).getY() == n.getY() + 1){
        surroundings[0] = "baby";
      }
      if (babies.get(i).getX() == n.getX() && babies.get(i).getY() == n.getY() - 1){
        surroundings[2] = "baby";
      }
      if (babies.get(i).getX() == n.getX() + 1 && babies.get(i).getY() == n.getY()){
        surroundings[1] = "baby";
      }

      if (babies.get(i).getX() == n.getX() - 1 && babies.get(i).getY() == n.getY()){
        surroundings[3] = "baby";
      }

    }


    //checks for player in front of any greeblers
    //checks down
    if(n.getX() == one.getX() && n.getY() + 1 == one.getY()){
      surroundings[0] = "player";
    }
    //checks up
    if(n.getX() == one.getX() && n.getY() - 1 == one.getY()){
      surroundings[2] = "player";
    }
    //checks right
    if(n.getX() + 1 == one.getX() && n.getY() == one.getY()){
      surroundings[1] = "player";
    }
    //checks left
    if(n.getX() - 1 == one.getX() && n.getY() == one.getY()){
      surroundings[3] = "player";
    }
    for(int g = 0; g < surroundings.length; g++){
      if(surroundings[g] == null){
        surroundings[g] = " ";
      }
    }

    return surroundings;

  }




//PickUpBaby(player n, baby1) Allows player to pickup the babies
public static void pickUpBaby(Player n, Terminal t){
  int a = - 1;
  for (int i = 0; i < babies.size(); i++){
    if (babies.get(i).getX() == n.getX() && babies.get(i).getY() == n.getY()){
      a = i;
    }
  }
  if (a != -1){
    babies.get(a).pickUp();
    n.pickUpBaby();
    babies.get(a).changeGraphic('\u0000');
    t.moveCursor(babies.get(a).getX(), babies.get(a).getY());
    t.putCharacter(babies.get(a).getGraphic());
    babies.get(a).setX(50);
    babies.get(a).setY(50);
  }
}

  public static void main(String[] args){
    Terminal terminal = TerminalFacade.createTextTerminal();
    terminal.enterPrivateMode();
    TerminalSize size =  new TerminalSize(100,300);//terminal.getTerminalSize();
  //  size.setRows(100);
  //  size.setColumns(200);
    terminal.setCursorVisible(false);
    boolean running = true;


    int x = 10;
    int y = 10;

    while(running){

			terminal.moveCursor(one.getX(),one.getY());
			terminal.applyBackgroundColor(Terminal.Color.WHITE);
			terminal.applyForegroundColor(Terminal.Color.BLACK);
			//applySGR(a,b) for multiple modifiers (bold,blink) etc.
			terminal.applySGR(Terminal.SGR.ENTER_UNDERLINE);
			terminal.putCharacter('\u00a4');
			//terminal.putCharacter(' ');
			terminal.applyBackgroundColor(Terminal.Color.DEFAULT);
			terminal.applyForegroundColor(Terminal.Color.DEFAULT);
			terminal.applySGR(Terminal.SGR.RESET_ALL);


			terminal.moveCursor(size.getColumns()-5,5);
			terminal.applyBackgroundColor(Terminal.Color.RED);
			terminal.applyForegroundColor(Terminal.Color.YELLOW);
			terminal.applySGR(Terminal.SGR.ENTER_BOLD);
      /*
			terminal.putCharacter(' ');
			terminal.putCharacter(' ');
			terminal.putCharacter('\u262d');
			terminal.putCharacter(' ');
			terminal.moveCursor(size.getColumns()-5,6);
			terminal.putCharacter(' ');
			terminal.putCharacter(' ');
			terminal.putCharacter(' ');
			terminal.putCharacter(' ');
      */
			terminal.applyForegroundColor(Terminal.Color.DEFAULT);

      fillScreen(terminal);
      putString(1, 2, terminal, "Player health: " + one.getHealth());
      putString(1, 3, terminal, "greebler 1 health: " + greeb1.getHealth());
      putString(1, 4, terminal, "greebler 2 health: " + greeb2.getHealth());
      putString(1, 5, terminal, "Babies To Pick Up: " + one.getBabiesToCollect());
      putString(1, 6, terminal, "Babies Picked Up: " + one.getBabiesCollected());
      putString(50, 6, terminal, "around: " + checkAround(one)[0] + ", " + checkAround(one)[1] + ", " + checkAround(one)[2] + ", " + checkAround(one)[3]);
  //    putString(1, 7, terminal, "inFront: " + checkInFront(one));

			Key key = terminal.readInput();

			if (key != null)
			{

				if (key.getKind() == Key.Kind.Escape) {

					terminal.exitPrivateMode();
					running = false;
					System.out.println(one.getX());
					System.out.println(one.getY());
				}

				if (key.getKind() == Key.Kind.ArrowLeft) {
          if (checkAround(one)[3].equals(" ")){
            terminal.moveCursor(one.getX(),one.getY());
  					terminal.putCharacter(' ');
				    one.moveLeft();
            x--;
            }
            if (checkAround(one)[3].equals("baby")){
              one.moveLeft();
              pickUpBaby(one, terminal);
            }
				}

				if (key.getKind() == Key.Kind.ArrowRight) {
          if (checkAround(one)[1].equals(" ")){
            terminal.moveCursor(one.getX(),one.getY());
  					terminal.putCharacter(' ');
					  one.moveRight();
            x++;
          }
          if (checkAround(one)[1].equals("baby")){
            one.moveRight();
            pickUpBaby(one, terminal);
          }
				}

				if (key.getKind() == Key.Kind.ArrowUp) {
          if (checkAround(one)[2].equals(" ")){
            terminal.moveCursor(one.getX(),one.getY());
  					terminal.putCharacter(' ');
					  one.moveUp();
            y++;
          }
          if (checkAround(one)[2].equals("baby")){
            one.moveDown();
            pickUpBaby(one, terminal);
          }
				}

				if (key.getKind() == Key.Kind.ArrowDown) {
          one.setDirection("down");
					if (checkAround(one)[0].equals(" ")){
            terminal.moveCursor(one.getX(),one.getY());
            terminal.putCharacter(' ');
            one.setDirection("down");
					  one.moveDown();
            y++;
          }
          if (checkAround(one)[0].equals("baby")){
            one.moveDown();
            pickUpBaby(one, terminal);
          }
				}
				//attacking
				if (key.getCharacter() == ' ') {
					attack(one);
				}
      }
    }
  }
}

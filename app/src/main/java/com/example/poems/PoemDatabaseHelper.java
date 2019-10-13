package com.example.poems;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class PoemDatabaseHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "poem"; //DB name
    private static final int DB_VERSION = 1; //DB version

    PoemDatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE POEMS (" +
                "_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "TITLE TEXT, " +
                "AUTHOR TEXT," +
                "CONTENT TEXT," +
                "DESCRIPTION TEXT," +
                "GRADE INTEGER," +
                "IS_PASS NUMERIC);");
        insertPoem(db, "咏鹅", "骆宾王",
                "鹅，鹅，鹅，\n曲项向天歌，\n白毛浮绿水，\n红掌拨清波。",
                "", 1, true);
        insertPoem(db, "江南", "汉乐府",
                "江南可采莲，\n莲叶何田田，\n鱼戏莲叶间，\n鱼戏莲叶东，\n鱼戏莲叶西，\n鱼戏莲叶南，\n鱼戏莲叶北。",
                "", 1, true);
        insertPoem(db, "塞下曲", "唐 卢纶",
                "月黑雁飞高，\n单于夜遁逃。\n欲将轻骑逐，\n大雪满弓刀。",
                "①塞下曲：古时边塞的一种军歌。\t" +
                        "②月黑：没有月光。\t" +
                        "③单于（chán yú ）：匈奴的首领。这里指入侵者的最高统帅。\t" +
                        "④遁：逃走。\t" +
                        "⑤将：率领。\t" +
                        "⑥轻骑：轻装快速的骑兵。\t" +
                        "⑦逐：追赶。\t" +
                        "⑧满：沾满。\n" +
                        "译文：\n" +
                        "暗淡的月夜里，一群大雁惊叫着高飞而起，暴露了单于的军队想要趁夜色潜逃的阴谋。将军率领轻骑兵一路追杀，顾不得漫天的大雪已落满弓和刀。",
                3, true);
        insertPoem(db, "忆江南", "唐 白居易",
                "江南好，\n风景旧曾谙。\n日出江花红胜火，\n春来江水绿如蓝，\n能不忆江南？",
                "译文： \n" +
                        "江南的风景多么美好，风景久已熟悉。春天到来时，太阳从江面升起，把江边的鲜花照得比火红，碧绿的江水绿得胜过蓝草。怎能叫人不怀念江南？\n" +
                        "整体赏析: \n" +
                        "忆江南，本为唐教坊曲名，后用作词牌名。", 3, true);
        insertPoem(db, "江南春", "唐 杜牧",
                "千里莺啼绿映红，\n水村山郭酒旗风。\n南朝四百八十寺，\n多少楼台烟雨中",
                " 释义：\n莺啼：即莺啼燕语。\t" +
                        "郭：外城。此处指城镇。\t" +
                        "酒旗：一种挂在门前以作为酒店标记的小旗。\t" +
                        "南朝：指先后与北朝对峙的宋、齐、梁、陈政权。\t" +
                        "四百八十寺：南朝皇帝和大官僚好佛，在京城（今南京市）大建佛寺。据《南史·循吏·郭祖深传》说：“都下佛寺五百余所”。这里说四百八十寺，是虚数。\t" +
                        "楼台：楼阁亭台。此处指寺院建筑。\t" +
                        "烟雨：细雨蒙蒙，如烟如雾。\n" +
                        "译文：\n" +
                        "江南大地鸟啼声声绿草红花相映，水边村寨山麓城郭处处酒旗飘动。\t" +
                        "南朝遗留下的四百八十多座古寺，无数的楼台全笼罩在风烟云雨中。\n" +
                        "整体赏析:\n" +
                        "这首《江南春》，千百年来素负盛誉。四句诗，既写出了江南春景的丰富多彩，也写出了它的广阔、深邃和迷离。", 3, true);
        insertPoem(db, "蜂", "唐 罗隐", "不论平地与山尖，\n无限风光尽被占。\n" +
                        "采得百花成蜜后，\n为谁辛苦为谁甜。",
                "释义：\n⑴山尖：山峰。\t" +
                        "⑵无限风光：极其美好的风景。占：占有，占据。\t" +
                        "⑶采：采取，这里指采取花蜜。\n" +
                        "整体赏析:\n" +
                        "不论平地与山尖，无限风光尽被占。无论是在平原还是在山野，到处都可以见到蜜蜂忙忙碌碌采蜜的身影。越是春光明媚、鲜花盛开的地方就越能吸引蜜蜂。这两句语气十分肯定，盛赞蜜蜂尽占美好的春光，表现了诗人对蜜蜂的羡慕与赞美之情。\n" +
                        "采得百花成蜜后，为谁辛苦为谁甜？这两句急转直下，由前面盛赞蜜蜂“占尽风光”转而咏叹它终生徒劳，所获甚少。采花、酿蜜本是蜜蜂的天职。它辛苦酿成的蜜主要是用来供养蜂王，或被人所用，自己享用的却很少，而这完全是出于它的本能，根本不会意识到这有什么不公平。可是诗人却从这里发现了问题，并替蜜蜂发出了“为谁辛苦为谁甜”的不平之鸣。\n", 3, true);
        insertPoem(db, "赠刘景文", "北宋 苏轼", "荷尽已无擎雨盖⑵，\n" +
                        "菊残犹有傲霜枝⑶。\n" +
                        "一年好景君须记⑷，\n" +
                        "正是橙黄橘绿时⑸。\n",
                "释义：\n⑴刘景文：刘季孙，字景文，工诗，时任两浙兵马都监，驻杭州。苏轼视他为国士，曾上表推荐，并以诗歌唱酬往来。\t" +
                        "⑵荷尽：荷花枯萎，残败凋谢。擎：举，向上托。雨盖：旧称雨伞，诗中比喻荷叶舒展的样子。\t" +
                        "⑶菊残：菊花凋谢。犹：仍然。傲霜：不怕霜动寒冷，坚强不屈。\t" +
                        "⑷君：原指古代君王，后泛指对男子的敬称，您。须记：一定要记住。\t" +
                        "⑸正是：一作“最是”。橙黄橘绿时：指橙子发黄、橘子将黄犹绿的时候，指农历秋末冬初。\n" +
                        "译文：\n 荷花凋谢连那擎雨的荷叶也枯萎了，只有那开败了菊花的花枝还傲寒斗霜。一年中最好的景致你一定要记住，那就是在橙子金黄、橘子青绿的秋末冬初的时节啊。" +
                        "整体赏析:\n" +
                        "这首诗写的是初冬的景色。\n", 3, false);
        insertPoem(db, "江上渔者", "北宋 范仲淹", "江上往来人，\n但爱鲈鱼美。\n" +
                        "君看一叶舟，\n出没风波里。\n",
                "释义：\n1.渔者：捕鱼的人。\t" +
                        "2.但：只\t" +
                        "3.爱：喜欢\t" +
                        "4.鲈鱼：一种头大口大、体扁鳞细、背青腹白、 味道鲜美的鱼，生活在近岸浅海夏秋进入淡水河川后，肉更肥美，尤以松江所产最为名贵。\t" +
                        "5.君：你。\t" +
                        "6.一叶舟：像漂浮在水上的一片树叶似的小船。\t" +
                        "7.出没：若隐若现。指一会儿看得见，一会儿看不见。\t" +
                        "8.风波：波浪。\n" +
                        "整体赏析:\n" +
                        "诗中饱含了诗人对那些驾着一叶扁舟出没于滔滔风浪中的渔民的关切与同情之心，也表达了诗人对“只爱鲈鱼美”的江上人规劝之意。在江上和舟中两种环境、“来往”和“出没”两种动态、吃鱼人和捕鱼人两种生活的强烈对比中，显示出了诗人的意旨所在。\n", 3, false);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    private static void insertPoem(SQLiteDatabase db, String title, String author, String content,
                                    String desc, int grade, boolean is_pass) {
        ContentValues poemValues = new ContentValues();
        poemValues.put("TITLE", title);
        poemValues.put("AUTHOR", author);
        poemValues.put("CONTENT", content);
        poemValues.put("DESCRIPTION", desc);
        poemValues.put("GRADE", grade);
        poemValues.put("IS_PASS", is_pass);
        db.insert("POEMS", null, poemValues);
    }
}

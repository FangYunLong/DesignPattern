package cn.fyl.singleton;

/*
 * 饿汉单例模式
 */
public class Emperor {

	//加载类时，已初始化对象，加载速度慢，线程安全
	private static final Emperor singleton = new Emperor();

	private Emperor() {

	}

	public static Emperor getSingleton(){
		
		return singleton;
		
	}
	
}


/*懒汉式单例模式
 * 在类加载时，不创建实例，因此类加载速度快，但运行时获取对象的速度慢
public class Emperor {
    
    //静态私用成员，没有初始化
    private static Emperor singleton;
    
    //私有构造函数
    private LazySingleton()
    {
        
    }
    
    //静态，同步，公开访问点
    public static synchronized Emperor getSingleton()    
    {
        if(singleton == null)
        {
            singleton = new Emperor();
        }
        return singleton;
    }
}
*/

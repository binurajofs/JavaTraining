
	public static void main(String[] args) throws
	    ClassNotFoundException,
	    IllegalAccessException,
	    InstantiationException {

	    ClassLoader parentClassLoader = MyClassLoader.class.getClassLoader();
	    MyClassLoader classLoader = new MyClassLoader(parentClassLoader);
	    Class myObjectClass = classLoader.loadClass("reflection.MyObject");

	    AnInterface2       object1 =
	            (AnInterface2) myObjectClass.newInstance();

	    MyObjectSuperClass object2 =
	            (MyObjectSuperClass) myObjectClass.newInstance();

	    //create new class loader so classes can be reloaded.
	    classLoader = new MyClassLoader(parentClassLoader);
	    myObjectClass = classLoader.loadClass("reflection.MyObject");

	    object1 = (AnInterface2)       myObjectClass.newInstance();
	    object2 = (MyObjectSuperClass) myObjectClass.newInstance();

	}

	public class MyClassLoader extends ClassLoader{

	    public MyClassLoader(ClassLoader parent) {
        	super(parent);
    	}

    	public Class loadClass(String name) throws ClassNotFoundException {
        	if(!"reflection.MyObject".equals(name))
        	        return super.loadClass(name);

        	try {
            		String url = "file:C:/data/projects/tutorials/web/WEB-INF/" +
                            "classes/reflection/MyObject.class";
            	URL myUrl = new URL(url);
            	URLConnection connection = myUrl.openConnection();
            	InputStream input = connection.getInputStream();
            	ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            	int data = input.read();

            		while(data != -1){
            	    buffer.write(data);
            	    data = input.read();
            	}

            	input.close();

            	byte[] classData = buffer.toByteArray();

            	return defineClass("reflection.MyObject",
            	        classData, 0, classData.length);

        	} catch (MalformedURLException e) {
        	    e.printStackTrace();
       		 } catch (IOException e) {
       	     e.printStackTrace();
       	 }

       	 return null;
    }
}

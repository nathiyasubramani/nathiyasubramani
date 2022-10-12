package fileIO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {
	public static void main(String[] args) {
        Path path = Paths.get("D:\\...OldComp\\Upasana\\ContentDevelopment\\Java 8 Fundamental\\Source Code\\Lab12\\ActivityLab12\\PathExample\\src\\test");
          System.out.println("Absolute Path:"+path.isAbsolute());
          System.out.println("FileName:"+path.getFileName());
          System.out.println("Absolute Path:"+path.toAbsolutePath().toString());
          System.out.println("Root:"+path.getRoot());
          System.out.println("Parent:"+path.getParent());
          System.out.println("Name Count:"+path.getNameCount());
          System.out.println("Get first name:"+path.getName(0));
          System.out.println("Subpath:" +path.subpath(0, 3));
          System.out.println("Names in path:"+path.getNameCount());
          //Path path1 = Paths.get("E:\\JavaFullStack\\projects\\EShopping\\..\\PaymentGateway");
          //Path path2 = path1.normalize();
          //Path path3=path1.resolve(path);
          //Path path4=path.relativize(path1);
//          System.out.println("pathNormalized = "+path2);
//          System.out.println("pathResolved = " +path3);
//          System.out.println("pathRevatilized = "+ path4);
	}
}

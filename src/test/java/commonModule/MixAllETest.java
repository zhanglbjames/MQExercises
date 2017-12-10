package commonModule;

import org.junit.Test;

import java.io.File;

/**
 * @author zhanglbjames@163.com
 * @version Created on 17-12-8.
 */
public class MixAllETest {
    @Test
    public void traverseSystemPropertiesTest() {
        MixAllE.traverseSystemProperties();
    }

    /**
     -- listing properties --
     java.runtime.name=Java(TM) SE Runtime Environment
     sun.boot.library.path=/home/mac/projects/java/jdk1.8.0_151/...
     java.vm.version=25.151-b12
     java.vm.vendor=Oracle Corporation
     java.vendor.url=http://java.oracle.com/
     path.separator=:
     java.vm.name=Java HotSpot(TM) 64-Bit Server VM
     file.encoding.pkg=sun.io
     user.country=CN
     sun.java.launcher=SUN_STANDARD
     sun.os.patch.level=unknown
     java.vm.specification.name=Java Virtual Machine Specification
     user.dir=/home/mac/ideaprojects/MQExercises
     java.runtime.version=1.8.0_151-b12
     java.awt.graphicsenv=sun.awt.X11GraphicsEnvironment
     java.endorsed.dirs=/home/mac/projects/java/jdk1.8.0_151/...
     os.arch=amd64
     java.io.tmpdir=/tmp
     line.separator=

     java.vm.specification.vendor=Oracle Corporation
     os.name=Linux
     sun.jnu.encoding=UTF-8
     java.library.path=/home/mac/projects/idea-IU-172.3968.1...
     java.specification.name=Java Platform API Specification
     java.class.version=52.0
     sun.management.compiler=HotSpot 64-Bit Tiered Compilers
     os.version=4.4.0-101-generic
     user.home=/home/mac
     user.timezone=
     java.awt.printerjob=sun.print.PSPrinterJob
     file.encoding=UTF-8
     java.specification.version=1.8
     user.name=mac
     java.class.path=/home/mac/projects/idea-IU-172.3968.1...
     java.vm.specification.version=1.8
     sun.arch.data.model=64
     java.home=/home/mac/projects/java/jdk1.8.0_151/jre
     sun.java.command=com.intellij.rt.execution.junit.JUnit...
     java.specification.vendor=Oracle Corporation
     user.language=zh
     awt.toolkit=sun.awt.X11.XToolkit
     java.vm.info=mixed mode
     java.version=1.8.0_151
     java.ext.dirs=/home/mac/projects/java/jdk1.8.0_151/...
     sun.boot.class.path=/home/mac/projects/java/jdk1.8.0_151/...
     java.vendor=Oracle Corporation
     file.separator=/
     java.vendor.url.bug=http://bugreport.sun.com/bugreport/
     idea.test.cyclic.buffer.size=1048576
     sun.cpu.endian=little
     sun.io.unicode.encoding=UnicodeLittle
     sun.desktop=gnome
     sun.cpu.isalist=
     zhanglbjames

     */

    @Test
    public void getPIDTest() {
        MixAllE.getPID();
    }

    /**
     * 形式为 PID@UserName : 6115@mac
     */

    @Test
    public void getPIDPTest() {
        MixAllE.getPIDPlus();
    }

    @Test
    public void testGetFileParent() {
        /**
         *  fileName : /tmp/MixAllTestTime
         *  getParent: /tmp
         *  getParentFile: /tmp
         */
        String fileName = System.getProperty("java.io.tmpdir") + File.separator + "MixAllTest" + System.currentTimeMillis();
        MixAllE.getFileProperties(fileName);
    }

    @Test
    public void testMkdir() {
        String fileName = System.getProperty("java.io.tmpdir") +
                File.separator + "MixAllE"+
                File.separator + "MixAllTest" +
                File.separator + "test" +
                System.currentTimeMillis();

        // mkdir output : false
        MixAllE.mkdirOrmkdirs(fileName,true);

        // mkdirs output : true
        MixAllE.mkdirOrmkdirs(fileName,false);
    }

    @Test
    public void testReflect() {
        ObjectProp objectProp = new ObjectProp("zhanglbjames","000001");
        MixAllE.objectPropReflect(objectProp);
    }


}

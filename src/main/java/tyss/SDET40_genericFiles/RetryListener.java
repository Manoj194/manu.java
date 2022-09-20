package tyss.SDET40_genericFiles;

import java.lang.reflect.Constructor;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import com.github.dockerjava.transport.DockerHttpClient.Request.Method;

public abstract class RetryListener implements IAnnotationTransformer{

	public void transform(ITestAnnotation annotation,Class testclClass,Constructor testConstructor,Method testMethod) {
		annotation.setRetryAnalyzer(tyss.SDET40_genericFiles.RetryImplimentation.class);
	}
}

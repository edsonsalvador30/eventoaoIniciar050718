package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;
import org.springframework.data.domain.*;
import org.springframework.validation.annotation.*;
import org.springframework.web.bind.annotation.*;

/** 
* 
* RestController @generated 
* 
*/

@RestController
@RequestMapping(value = "/api/rest/main/Bloco")
@CronapiMetaData(type = "blockly")
@CronappSecurity(post = "Public", get = "Public", execute = "Public", delete = "Public", put = "Public")
public class Bloco {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */

	@RequestMapping(method = RequestMethod.GET, value = "/Executar")
	// Bloco
	public static synchronized Var Executar() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				cronapi.util.Operations.scheduleExecution(() -> {
					try {
						fa_C3_A7a_algo();
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				}, Var.VAR_NULL, Var.valueOf(15), Var.valueOf("SECONDS"));
				return Var.VAR_NULL;
			}
		}.call();
	}

	/**
	 */

	@RequestMapping(method = RequestMethod.GET, value = "/assincrono")
	// Descreva esta função...
	public static synchronized void assincrono() throws Exception {
		new Callable<Var>() {

			public Var call() throws Exception {
				cronapi.util.Operations.executeAsync(() -> {
					try {
						fa_C3_A7a_algo();
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				});
				return Var.VAR_NULL;
			}
		}.call();
	}

	/**
	 */

	@RequestMapping(method = RequestMethod.GET, value = "/fa_C3_A7a_algo")
	// Descreva esta função...
	public static synchronized void fa_C3_A7a_algo() throws Exception {
		new Callable<Var>() {

			public Var call() throws Exception {
				System.out.println(Var.valueOf("Teste").getObjectAsString());
				return Var.VAR_NULL;
			}
		}.call();
	}

}

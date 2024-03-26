package bibliotecaB;

import java.util.List;
import java.util.stream.Collectors;

import org.json.simple.*;

public class JsonAdapter extends VoorheesExporter{
	private JSONArray jsona;
	
	public JsonAdapter(JSONArray json) {
		this.jsona = json;
		
	}
	
	private JSONObject privado(Socio socio) {
		JSONObject jsono = new JSONObject();
		jsono.put("nombre",socio.getNombre());
		jsono.put("legajo",socio.getLegajo());
		jsono.put("email",socio.getEmail());
		return jsono;
	}
	@Override
	public String exportar(List<Socio> socios) {
		socios.stream()
		.forEach(s -> jsona.add(this.privado(s)));
		return jsona.toJSONString();
	}
}


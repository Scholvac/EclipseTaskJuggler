package de.sos.preferences;


import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.jface.preference.IPreferenceStore;
import org.osgi.service.prefs.Preferences;

public class PreferencesTool {

	static ConfigurationScope cs = new ConfigurationScope();
	
	/**
	 * Saves a value which survives the termination of the running eclipse instance
	 * @param qualifier i.e. de.wi_ol.be.scenarioconf
	 * @param node i.e. controller
	 * @param key i.e. sompath
	 * @param value to save (note: only primitives working)
	 */
	public static void savePreferenceValue(String qualifier, String node, String key, Object value){
		IEclipsePreferences preferences = cs.getNode(qualifier);
		org.osgi.service.prefs.Preferences preference = preferences.node(node);
		if(value instanceof String)
			preference.put(key, (String)value);
		else if(value instanceof Boolean)
				preference.putBoolean(key, (Boolean) value);
		else if(value instanceof Long)
			preference.putLong(key, (Long) value);
		else if(value instanceof Integer)
			preference.putInt(key, (Integer) value);
		else if(value instanceof Float)
			preference.putFloat(key, (Float) value);
		else if(value instanceof Double)
			preference.putDouble(key, (Double) value);
		else if(value instanceof byte[])
			preference.putByteArray(key, (byte[]) value);
		try {
			preferences.flush();
		}catch (org.osgi.service.prefs.BackingStoreException e) {
			e.printStackTrace();
		}	
	}
	
	
	public static int getInt(String qualifier, String node, String key, int defaultValue)
	{
		Preferences pref = getPreference(qualifier, node);
		if (pref != null)
			return pref.getInt(key, defaultValue);
		return defaultValue;
	}
	public static long getLong(String qualifier, String node, String key, long defaultValue)
	{
		Preferences pref = getPreference(qualifier, node);
		if (pref != null)
			return pref.getLong(key, defaultValue);
		return defaultValue;
	}
	public static boolean getBoolean(String qualifier, String node, String key, boolean defaultValue)
	{
		Preferences pref = getPreference(qualifier, node);
		if (pref != null)
			return pref.getBoolean(key, defaultValue);
		return defaultValue;
	}
	public static byte getByte(String qualifier, String node, String key, byte defaultValue)
	{
		Preferences pref = getPreference(qualifier, node);
		if (pref != null)
			return (byte)pref.getInt(key, defaultValue);
		return defaultValue;
	}
	public static float getFloat(String qualifier, String node, String key, float defaultValue)
	{
		Preferences pref = getPreference(qualifier, node);
		if (pref != null)
			return pref.getFloat(key, defaultValue);
		return defaultValue;
	}
	public static double getDouble(String qualifier, String node, String key, double defaultValue)
	{
		Preferences pref = getPreference(qualifier, node);
		if (pref != null)
			return pref.getDouble(key, defaultValue);
		return defaultValue;
	}
	public static String getString(String qualifier, String node, String key, String defaultValue)
	{
		Preferences pref = getPreference(qualifier, node);
		if (pref != null)
			return pref.get(key, defaultValue);
		return defaultValue;
	}
	
	private static Preferences getPreference(String qualifier, String node) {
		IEclipsePreferences preferences = cs.getNode(qualifier);
		if(preferences != null){
			Preferences preference = preferences.node(node);
			return preference;
		}
		return null;
	}


	/**
	 * Loads a value previously saved
	 * @param qualifier
	 * @param node
	 * @param key
	 * @param type type of the saved value (i.e. String.class)
	 * @return value as String
	 */
	public static Object loadPreferenceValue(String qualifier, String node, String key, Class type){
		Object returnValue = null;
		IEclipsePreferences preferences = cs.getNode(qualifier);
		if(preferences != null){
			org.osgi.service.prefs.Preferences preference = preferences.node(node);
			if(preference != null){
				if(type == String.class){
					returnValue = preference.get(key, null);
				}
				else if(type == Boolean.class){
					returnValue = preference.getBoolean(key, false);
				}
				else if(type == Float.class){
					returnValue = preference.getFloat(key, -1);
				}
				else if(type == Double.class){
					returnValue = preference.getDouble(key,-1);
				}
				else if(type ==  Long.class){
					returnValue = preference.getLong(key, -1);
				}
				else if(type == Integer.class){
					returnValue = preference.getInt(key, -1);
				}
				else if(type == byte[].class){
					returnValue = preference.getByteArray(key, null);
				}
				return returnValue;
			}
		}
		return null;
	}


	public static boolean getBoolean(IPreferenceStore store, String id, boolean def) {
		if (store == null || id == null || id.isEmpty())
			return def;
		if (!store.contains(id))
			return def;
		return store.getBoolean(id);
	}
	
	
	public static int getInt(IPreferenceStore store, String id, int defaultValue)
	{
		if (store == null || id == null || id.isEmpty())
			return defaultValue;
		if (!store.contains(id))
			return defaultValue;
		return store.getInt(id);
	}
	public static long getLong(IPreferenceStore store, String id, long defaultValue)
	{
		if (store == null || id == null || id.isEmpty())
			return defaultValue;
		if (!store.contains(id))
			return defaultValue;
		return store.getLong(id);
	}

	public static byte getByte(IPreferenceStore store, String id, byte defaultValue)
	{
		if (store == null || id == null || id.isEmpty())
			return defaultValue;
		if (!store.contains(id))
			return defaultValue;
		return (byte)store.getInt(id);
	}
	public static float getFloat(IPreferenceStore store, String id, float defaultValue)
	{
		if (store == null || id == null || id.isEmpty())
			return defaultValue;
		if (!store.contains(id))
			return defaultValue;	
		return store.getFloat(id);
	}
	public static double getDouble(IPreferenceStore store, String id, double defaultValue)
	{
		if (store == null || id == null || id.isEmpty())
			return defaultValue;
		if (!store.contains(id))
			return defaultValue;
		return store.getDouble(id);
	}
	public static String getString(IPreferenceStore store, String id, String defaultValue)
	{
		if (store == null || id == null || id.isEmpty())
			return defaultValue;
		if (!store.contains(id))
			return defaultValue;
		return store.getString(id);
	}
	
	
	
	
	
	
}

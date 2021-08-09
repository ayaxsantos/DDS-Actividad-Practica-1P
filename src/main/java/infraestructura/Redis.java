package infraestructura;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.Set;

public class Redis
{
    private final String host = "localhost";
    private final int puerto = 6379;

    public JedisPool abrirConexion()
    {
        //En este caso, se utiliza la configuracion por defecto de redis para test
        return new JedisPool(new JedisPoolConfig(),this.host,this.puerto);
    }

    public void insertarSet(String clave, String valor)
    {
        JedisPool jedisPool = this.abrirConexion();
        try(Jedis jedis = jedisPool.getResource())
        {
            jedis.sadd(clave,valor);
        }
        jedisPool.close();
    }

    public Set<String> leerSet(String clave)
    {
        Set<String> valores;
        JedisPool jedisPool = this.abrirConexion();
        try(Jedis jedis = jedisPool.getResource())
        {
            valores = jedis.smembers(clave);
        }
        jedisPool.close();
        return valores;
    }
}

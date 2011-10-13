package org.eclipse.jetty.nosql.kvs;


public interface KeyValueStoreClient {
	public boolean establish() throws KeyValueStoreClientException;

	public boolean shutdown() throws KeyValueStoreClientException;

	public boolean isAlive();

	public byte[] get(String key) throws KeyValueStoreClientException;

	public boolean set(String key, byte[] raw) throws KeyValueStoreClientException;

	public boolean set(String key, byte[] raw, int exp) throws KeyValueStoreClientException;

	public boolean add(String key, byte[] raw) throws KeyValueStoreClientException;

	public boolean add(String key, byte[] raw, int exp) throws KeyValueStoreClientException;

	public boolean delete(String key) throws KeyValueStoreClientException;
}
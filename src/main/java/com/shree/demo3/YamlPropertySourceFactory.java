package com.shree.demo3;

import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PropertySourceFactory;

import java.util.Objects;
import java.util.Properties;

public class YamlPropertySourceFactory implements PropertySourceFactory {

    @Override
    public PropertySource<?> createPropertySource(String s, EncodedResource encodedResource) {
        Properties properties = this.loadYamlIntoProperties(encodedResource.getResource());

        return new PropertiesPropertySource(
                (s != null && !s.isEmpty()) ?
                        s : Objects.requireNonNull(encodedResource.getResource().getFilename()),
                properties);
    }

    private Properties loadYamlIntoProperties(Resource resource) {
        YamlPropertiesFactoryBean factoryBean = new YamlPropertiesFactoryBean();
        factoryBean.setResources(resource);
        factoryBean.afterPropertiesSet();

        return factoryBean.getObject();
    }
}
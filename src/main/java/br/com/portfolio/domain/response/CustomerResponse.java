package br.com.portfolio.domain.response;

import br.com.portfolio.domain.Customer;
import br.com.portfolio.domain.GenderEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;

@RequiredArgsConstructor
public class CustomerResponse {
    @JsonIgnore
    private final Customer customer;

    @ApiModelProperty("Person autogenerated id")
    public ObjectId getId() {
        return customer.getId();
    }
    @ApiModelProperty("Person's name")
    public String getName() {
        return customer.getName();
    }
    @ApiModelProperty("Person's gender")
    public GenderEnum getGender() {
        return customer.getGender();
    }
    @ApiModelProperty("Person's nickname")
    public String getNickname() {
        return customer.getNickname();
    }
    @ApiModelProperty("Person's email")
    public String getEmail() {
        return customer.getEmail();
    }
    @ApiModelProperty("Person's birthDate")
    public LocalDate getBirthDate() {
        return customer.getBirthDate();
    }
    @ApiModelProperty("Person's document Number")
    public String getDocumentNumber() {
        return customer.getDocumentNumber();
    }
}
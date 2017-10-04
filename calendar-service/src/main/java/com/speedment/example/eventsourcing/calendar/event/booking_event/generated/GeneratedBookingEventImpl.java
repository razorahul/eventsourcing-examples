package com.speedment.example.eventsourcing.calendar.event.booking_event.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.example.eventsourcing.calendar.event.booking_event.BookingEvent;
import com.speedment.runtime.core.util.OptionalUtil;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.StringJoiner;
import java.util.UUID;

/**
 * The generated base implementation of the {@link
 * BookingEvent}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedBookingEventImpl implements BookingEvent {
    
    private long id;
    private UUID booking;
    private Type type;
    private byte version;
    private Integer userId;
    private String resource;
    private LocalDateTime bookFrom;
    private LocalDateTime bookTo;
    
    protected GeneratedBookingEventImpl() {
        
    }
    
    @Override
    public long getId() {
        return id;
    }
    
    @Override
    public UUID getBooking() {
        return booking;
    }
    
    @Override
    public Type getType() {
        return type;
    }
    
    @Override
    public byte getVersion() {
        return version;
    }
    
    @Override
    public OptionalInt getUserId() {
        return OptionalUtil.ofNullable(userId);
    }
    
    @Override
    public Optional<String> getResource() {
        return Optional.ofNullable(resource);
    }
    
    @Override
    public Optional<LocalDateTime> getBookFrom() {
        return Optional.ofNullable(bookFrom);
    }
    
    @Override
    public Optional<LocalDateTime> getBookTo() {
        return Optional.ofNullable(bookTo);
    }
    
    @Override
    public BookingEvent setId(long id) {
        this.id = id;
        return this;
    }
    
    @Override
    public BookingEvent setBooking(UUID booking) {
        this.booking = booking;
        return this;
    }
    
    @Override
    public BookingEvent setType(Type type) {
        this.type = type;
        return this;
    }
    
    @Override
    public BookingEvent setVersion(byte version) {
        this.version = version;
        return this;
    }
    
    @Override
    public BookingEvent setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }
    
    @Override
    public BookingEvent setResource(String resource) {
        this.resource = resource;
        return this;
    }
    
    @Override
    public BookingEvent setBookFrom(LocalDateTime bookFrom) {
        this.bookFrom = bookFrom;
        return this;
    }
    
    @Override
    public BookingEvent setBookTo(LocalDateTime bookTo) {
        this.bookTo = bookTo;
        return this;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = "       + Objects.toString(getId()));
        sj.add("booking = "  + Objects.toString(getBooking()));
        sj.add("type = "     + Objects.toString(getType()));
        sj.add("version = "  + Objects.toString(getVersion()));
        sj.add("userId = "   + Objects.toString(OptionalUtil.unwrap(getUserId())));
        sj.add("resource = " + Objects.toString(OptionalUtil.unwrap(getResource())));
        sj.add("bookFrom = " + Objects.toString(OptionalUtil.unwrap(getBookFrom())));
        sj.add("bookTo = "   + Objects.toString(OptionalUtil.unwrap(getBookTo())));
        return "BookingEventImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof BookingEvent)) { return false; }
        final BookingEvent thatBookingEvent = (BookingEvent)that;
        if (this.getId() != thatBookingEvent.getId()) {return false; }
        if (!Objects.equals(this.getBooking(), thatBookingEvent.getBooking())) {return false; }
        if (!Objects.equals(this.getType(), thatBookingEvent.getType())) {return false; }
        if (this.getVersion() != thatBookingEvent.getVersion()) {return false; }
        if (!Objects.equals(this.getUserId(), thatBookingEvent.getUserId())) {return false; }
        if (!Objects.equals(this.getResource(), thatBookingEvent.getResource())) {return false; }
        if (!Objects.equals(this.getBookFrom(), thatBookingEvent.getBookFrom())) {return false; }
        if (!Objects.equals(this.getBookTo(), thatBookingEvent.getBookTo())) {return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Long.hashCode(getId());
        hash = 31 * hash + Objects.hashCode(getBooking());
        hash = 31 * hash + Objects.hashCode(getType());
        hash = 31 * hash + Byte.hashCode(getVersion());
        hash = 31 * hash + Objects.hashCode(getUserId());
        hash = 31 * hash + Objects.hashCode(getResource());
        hash = 31 * hash + Objects.hashCode(getBookFrom());
        hash = 31 * hash + Objects.hashCode(getBookTo());
        return hash;
    }
}
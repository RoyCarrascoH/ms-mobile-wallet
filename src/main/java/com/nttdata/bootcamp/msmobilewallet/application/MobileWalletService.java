package com.nttdata.bootcamp.msmobilewallet.application;

import com.nttdata.bootcamp.msmobilewallet.dto.BankAccountDto;
import com.nttdata.bootcamp.msmobilewallet.dto.MobileWalletDto;
import com.nttdata.bootcamp.msmobilewallet.model.BankAccount;
import com.nttdata.bootcamp.msmobilewallet.model.MobileWallet;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MobileWalletService {
    public Flux<MobileWallet> findAll();

    public Mono<MobileWallet> findById(String idMobileWallet);

    // public Mono<MobileWallet> findByAccountNumber(String accountNumber);
    public Mono<MobileWalletDto> findByCellphone(String cellphone);

    public Mono<MobileWallet> save(MobileWalletDto mobileWalletDto);

    public Mono<MobileWallet> update(MobileWalletDto mobileWalletDto, String idMobileWallet);

    public Mono<Void> delete(String idMobileWallet);

    public Mono<MobileWalletDto> findMovementsByDocumentNumber(String documentNumber, String accountNumber);

    public Flux<MobileWallet> findByDocumentNumberAndWithdrawalAmount(String accountNumber, String cardNumber, Double withdrawalAmount);

    public Mono<MobileWallet> updateBalanceById(String idMobileWallet, Double balance);

    public Mono<MobileWallet> findByDebitCardNumberAndIsMainAccount(String debitCardNumber);

    public Flux<MobileWallet> findBalanceByDocumentNumber(String documentNumber);


}

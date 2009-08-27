#!/usr/bin/perl -w
use UI::Dialog;
foreach my $dialog (qw(ascii cdialog dialog whiptail zenity gdialog xdialog)) {
    print qq(Now running UI::Dialog module '$dialog'\n);
    my $d;
    eval "UI::Dialog->new( order => [ '$dialog' ] );";
    if ( $@ ) {
        print qq(Hmmm... Couldn't run UI::Dialog with '$dialog'\n);
    } else {
        $d = new UI::Dialog ( backtitle => 'Demo', title => 'Default',
                           height => 20, width => 65 , listheight => 5,
                           order => [ $dialog ] );
        $d->msgbox( title => 'Hello World!', text => 'Hello World!' );
    } # if ( $@ )
} # foreach my $dialog

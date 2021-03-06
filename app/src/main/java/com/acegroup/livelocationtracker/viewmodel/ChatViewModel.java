package com.acegroup.livelocationtracker.viewmodel;

import android.app.Application;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;

import com.acegroup.livelocationtracker.adapters.ChatAdapter;
import com.acegroup.livelocationtracker.models.ChatMessage;
import com.acegroup.livelocationtracker.viewmodel.repository.ChatRepository;

import java.util.List;

public class ChatViewModel extends AndroidViewModel {
    private ChatRepository chatRepository;



    public ChatViewModel(@NonNull Application application) {
        super(application);
        chatRepository=new ChatRepository();
    }

    public void setExtras(ChatAdapter chatAdapter, RecyclerView recyclerView, ProgressBar progressBar) {
        chatRepository.setChatAdapter(chatAdapter);
        chatRepository.setRecyclerView(recyclerView);
        chatRepository.setProgressBar(progressBar);
    }


    public LiveData<List<ChatMessage>> getAllChatMessages(String otherUID){
        return chatRepository.getAllChatMessages(otherUID);
    }

    public void addChatMessage(ChatMessage chatMessage, String otherUID){
        chatRepository.addChatMessage(chatMessage,otherUID);
    }

}
